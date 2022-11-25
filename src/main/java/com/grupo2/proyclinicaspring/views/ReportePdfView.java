package com.grupo2.proyclinicaspring.views;

import com.grupo2.proyclinicaspring.models.objetos.DataReporte;
import com.lowagie.text.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.text.SimpleDateFormat;
import java.util.*;

import com.lowagie.text.pdf.*;
import org.jfree.data.general.DefaultPieDataset;

@Component(value = "reportePdf")
public class ReportePdfView extends AbstractPdfView {

    HashMap<String,Long> mPie=new HashMap<>();

    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
                                    HttpServletRequest request, HttpServletResponse response) throws Exception {

        ArrayList<DataReporte> listaPacientes= (ArrayList) model.get("reportePac");

        Long cht=0L,cpt=0L,cmt=0L;

        SimpleDateFormat formato =
                new SimpleDateFormat("dd/MM/yyyy HH:mm", new Locale("es","ES"));
        String fecha = formato.format(new Date());
        document.addTitle("Reporte ("+fecha+")");

        Paragraph parrafo = new Paragraph("Reporte respecto a todos los pacientes de la clinica Interdial Norte");
        parrafo.setAlignment("center");
        document.add(parrafo);

//        Codigo para tabla
        PdfPTable tabla = new PdfPTable(8);
        tabla.setWidths(new float[]{3f,5f,4f,4f,4f,1f,1f,1f});
        tabla.setWidthPercentage(100);
        tabla.setSpacingBefore(25);
        tabla.setSpacingAfter(25);

        PdfPCell celda = new PdfPCell();
        celda.setBackgroundColor(new Color(184,218,255));
        celda.setPadding(2f);

        celda.setPhrase(new Phrase("Código del paciente"));
        tabla.addCell(celda);
        celda.setPhrase(new Phrase("Nombre y Apellido"));
        tabla.addCell(celda);
        celda.setPhrase(new Phrase("Nacionalidad"));
        tabla.addCell(celda);
        celda.setPhrase(new Phrase("Telefonos"));
        tabla.addCell(celda);
        celda.setPhrase(new Phrase("Documentos de identidad"));
        tabla.addCell(celda);
        celda.setPhrase(new Phrase("C.H"));
        tabla.addCell(celda);
        celda.setPhrase(new Phrase("C.P"));
        tabla.addCell(celda);
        celda.setPhrase(new Phrase("C.M"));
        tabla.addCell(celda);
        celda = new PdfPCell();
        for(int i=0;i<listaPacientes.size();i++){
            if(i%2==0){
                celda.setBackgroundColor(new Color(240,240,240));
            }else{
                celda.setBackgroundColor(new Color(220,220,220));
            }
            celda.setPhrase(new Phrase(listaPacientes.get(i).getCodPac()));
            tabla.addCell(celda);
            celda.setPhrase(new Phrase(listaPacientes.get(i).getNomApe()));
            tabla.addCell(celda);
            celda.setPhrase(new Phrase(listaPacientes.get(i).getNacionalidad()));
            tabla.addCell(celda);
            celda.setPhrase(new Phrase(listaPacientes.get(i).getTelefonos()));
            tabla.addCell(celda);
            celda.setPhrase(new Phrase(listaPacientes.get(i).getDocsIden()));
            tabla.addCell(celda);
            celda.setPhrase(new Phrase(""+listaPacientes.get(i).getCitasHechas()));
            tabla.addCell(celda);
            celda.setPhrase(new Phrase(""+listaPacientes.get(i).getCitasPen()));
            tabla.addCell(celda);
            celda.setPhrase(new Phrase(""+listaPacientes.get(i).getCitasMod()));
            tabla.addCell(celda);
            cht+=listaPacientes.get(i).getCitasHechas();
            cpt+=listaPacientes.get(i).getCitasPen();
            cmt+=listaPacientes.get(i).getCitasMod();
            Long valor=0L;
            if (mPie.containsKey(listaPacientes.get(i).getNacionalidad())) {
                valor=mPie.get(listaPacientes.get(i).getNacionalidad());
            }
            mPie.put(listaPacientes.get(i).getNacionalidad(),valor+1);
        }
        celda = new PdfPCell(new Phrase("Total" + ": "));
	    celda.setHorizontalAlignment(PdfPCell.ALIGN_RIGHT);
	    tabla.addCell(celda);
        celda.setPhrase(new Phrase(""+listaPacientes.size()));
        tabla.addCell(celda);
        celda.setPhrase(new Phrase(""));
        tabla.addCell(celda);
        celda.setPhrase(new Phrase(""));
        tabla.addCell(celda);
        celda.setPhrase(new Phrase(""));
        tabla.addCell(celda);
        celda.setPhrase(new Phrase(""+cht));
        tabla.addCell(celda);
        celda.setPhrase(new Phrase(""+cpt));
        tabla.addCell(celda);
        celda.setPhrase(new Phrase(""+cmt));
        tabla.addCell(celda);

        document.add(tabla);
        document.add(new Paragraph("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"));

//            Codigo para grafico pie

        JFreeChart chart= crearGraficoPie();
        int ancho=400, alto=400;
        PdfContentByte cb = writer.getDirectContent();
        PdfTemplate tp = cb.createTemplate(ancho, alto);
        Graphics2D g2d = tp.createGraphics(ancho, alto, new DefaultFontMapper());
        Rectangle2D r2d = new Rectangle2D.Double(0, 0, ancho, alto);
        chart.draw(g2d, r2d);
        g2d.dispose();
        tp.sanityCheck();
        cb.addTemplate(tp, 100, 100);
        cb.sanityCheck();

    }

    public JFreeChart crearGraficoPie(){
        DefaultPieDataset<String> dataset = new DefaultPieDataset<>();
        mPie.forEach((k,v)->dataset.setValue(k+" "+v,v));
        return ChartFactory.createPieChart(
                "Cantidad de pacientes por nacionalidad",
                dataset,
                true,
                true,
                false);
    }
}
