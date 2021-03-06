package uk.nhs.ciao.docs.enricher;

import uk.nhs.ciao.docs.parser.ParsedDocument;

/**
 * Enriches an incoming document with additional properties
 * <p>
 * If an enriching process would result in blocking the calling thread for a significant
 * time, consider implementing {@link AsyncDocumentEnricher} instead.
 * 
 * @see AsyncDocumentEnricher
 */
public interface DocumentEnricher {
	/**
	 * Enriches the specified document.
	 * 
	 * @param document The document to enrich
	 * @return The enriched document
	 * @throws Exception If the document could not be enriched
	 */
	ParsedDocument enrichDocument(final ParsedDocument document) throws Exception;
}
