package com.grupo2.proyclinicaspring.views;

import com.grupo2.proyclinicaspring.models.entities.DiagnosticoEntity;
import com.grupo2.proyclinicaspring.models.objetos.DataDiagnostico;
import com.grupo2.proyclinicaspring.models.objetos.DataReporte;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

@Component("diagnosticoPdf")
public class DiagnosticoPdfView extends AbstractPdfView {
    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArrayList<DataDiagnostico> listaDiag=(ArrayList) model.get("dataDiag");

        document.addTitle("Diagnosticos");

        Paragraph parrafo = new Paragraph("Esta es tu lista de diagnósticos con respecto a la cita seleccionada");
        parrafo.setAlignment("center");
        document.add(parrafo);

//        Codigo para tabla
        PdfPTable tabla = new PdfPTable(5);
        tabla.setWidths(new float[]{5f,10f,5f,4f,4f});
        tabla.setWidthPercentage(100);
        tabla.setSpacingBefore(25);
        tabla.setSpacingAfter(25);

        PdfPCell celda = new PdfPCell();
        celda.setBackgroundColor(new Color(184,218,255));
        celda.setPadding(2f);

        celda.setPhrase(new Phrase("Código del diagnóstico"));
        tabla.addCell(celda);
        celda.setPhrase(new Phrase("Tratamiento"));
        tabla.addCell(celda);
        celda.setPhrase(new Phrase("Pronóstico"));
        tabla.addCell(celda);
        celda.setPhrase(new Phrase("Enfermedad"));
        tabla.addCell(celda);
        celda.setPhrase(new Phrase("Tipo de diagnóstico"));
        tabla.addCell(celda);
        celda = new PdfPCell();
        for(int i=0;i<listaDiag.size();i++){
            if(i%2==0){
                celda.setBackgroundColor(new Color(240,240,240));
            }else{
                celda.setBackgroundColor(new Color(220,220,220));
            }
            celda.setPhrase(new Phrase(listaDiag.get(i).getCodDiag()));
            tabla.addCell(celda);
            celda.setPhrase(new Phrase(listaDiag.get(i).getTratamiento()));
            tabla.addCell(celda);
            celda.setPhrase(new Phrase(listaDiag.get(i).getPronostico()));
            tabla.addCell(celda);
            celda.setPhrase(new Phrase(""+listaDiag.get(i).getEnfermedad()));
            tabla.addCell(celda);
            celda.setPhrase(new Phrase(""+listaDiag.get(i).getTipoDiag()));
            tabla.addCell(celda);
        }
        document.add(tabla);

    }
}
