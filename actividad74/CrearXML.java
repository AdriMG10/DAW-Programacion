package org.ieslosremedios.daw1.prog.ut7.actividades.actividad74;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

public class CrearXML {
    public static void main(String[] args) {
        ArrayList<Persona> listaContactos = new ArrayList<>();
        listaContactos.add(new Persona("Luis", "653897567", "Calle Ecuador"));
        listaContactos.add(new Persona("Nuria", "688970234", "Avenida Miguel Hernández"));

        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Crear documento XML
            Document doc = docBuilder.newDocument();
            Element ElementoRaiz = doc.createElement("Contactos");
            doc.appendChild(ElementoRaiz);

            // Agregar cada contacto como un elemento en el documento
            for (Persona persona : listaContactos) {
                Element contacto = doc.createElement("Contacto");
                ElementoRaiz.appendChild(contacto);

                Element nombre = doc.createElement("Nombre");
                nombre.appendChild(doc.createTextNode(persona.getNombre()));
                contacto.appendChild(nombre);

                Element direccion = doc.createElement("Direccion");
                direccion.appendChild(doc.createTextNode(persona.getDireccion()));
                contacto.appendChild(direccion);

                Element telefono = doc.createElement("Telefono");
                telefono.appendChild(doc.createTextNode(persona.getTelefono()));
                contacto.appendChild(telefono);
            }

            // Guardar el documento XML en un archivo
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:/contactos.xml"));
            transformer.transform(source, result);

            System.out.println("El archivo XML ha sido creado con éxito");

        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }
}
