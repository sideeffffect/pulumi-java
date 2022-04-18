// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a postal address, e.g. for postal delivery or payments addresses. Given a postal address, a postal service can deliver items to a premise, P.O. Box or similar. It is not intended to model geographical locations (roads, towns, mountains). In typical usage an address would be created via user input or from importing existing data, depending on the type of process. Advice on address input / editing: - Use an i18n-ready address widget such as https://github.com/google/libaddressinput) - Users should not be presented with UI elements for input or editing of fields outside countries where that field is used. For more guidance on how to use this schema, please see: https://support.google.com/business/answer/6397478
 * 
 */
public final class PostalAddressResponse extends com.pulumi.resources.InvokeArgs {

    public static final PostalAddressResponse Empty = new PostalAddressResponse();

    /**
     * Unstructured address lines describing the lower levels of an address. Because values in address_lines do not have type information and may sometimes contain multiple values in a single field (e.g. "Austin, TX"), it is important that the line order is clear. The order of address lines should be "envelope order" for the country/region of the address. In places where this can vary (e.g. Japan), address_language is used to make it explicit (e.g. "ja" for large-to-small ordering and "ja-Latn" or "en" for small-to-large). This way, the most specific line of an address can be selected based on the language. The minimum permitted structural representation of an address consists of a region_code with all remaining information placed in the address_lines. It would be possible to format such an address very approximately without geocoding, but no semantic reasoning could be made about any of the address components until it was at least partially resolved. Creating an address only containing a region_code and address_lines, and then geocoding is the recommended way to handle completely unstructured addresses (as opposed to guessing which parts of the address should be localities or administrative areas).
     * 
     */
    @Import(name="addressLines", required=true)
      private final List<String> addressLines;

    public List<String> addressLines() {
        return this.addressLines;
    }

    /**
     * Optional. Highest administrative subdivision which is used for postal addresses of a country or region. For example, this can be a state, a province, an oblast, or a prefecture. Specifically, for Spain this is the province and not the autonomous community (e.g. "Barcelona" and not "Catalonia"). Many countries don't use an administrative area in postal addresses. E.g. in Switzerland this should be left unpopulated.
     * 
     */
    @Import(name="administrativeArea", required=true)
      private final String administrativeArea;

    public String administrativeArea() {
        return this.administrativeArea;
    }

    /**
     * Optional. BCP-47 language code of the contents of this address (if known). This is often the UI language of the input form or is expected to match one of the languages used in the address' country/region, or their transliterated equivalents. This can affect formatting in certain countries, but is not critical to the correctness of the data and will never affect any validation or other non-formatting related operations. If this value is not known, it should be omitted (rather than specifying a possibly incorrect default). Examples: "zh-Hant", "ja", "ja-Latn", "en".
     * 
     */
    @Import(name="languageCode", required=true)
      private final String languageCode;

    public String languageCode() {
        return this.languageCode;
    }

    /**
     * Optional. Generally refers to the city/town portion of the address. Examples: US city, IT comune, UK post town. In regions of the world where localities are not well defined or do not fit into this structure well, leave locality empty and use address_lines.
     * 
     */
    @Import(name="locality", required=true)
      private final String locality;

    public String locality() {
        return this.locality;
    }

    /**
     * Optional. The name of the organization at the address.
     * 
     */
    @Import(name="organization", required=true)
      private final String organization;

    public String organization() {
        return this.organization;
    }

    /**
     * Optional. Postal code of the address. Not all countries use or require postal codes to be present, but where they are used, they may trigger additional validation with other parts of the address (e.g. state/zip validation in the U.S.A.).
     * 
     */
    @Import(name="postalCode", required=true)
      private final String postalCode;

    public String postalCode() {
        return this.postalCode;
    }

    /**
     * Optional. The recipient at the address. This field may, under certain circumstances, contain multiline information. For example, it might contain "care of" information.
     * 
     */
    @Import(name="recipients", required=true)
      private final List<String> recipients;

    public List<String> recipients() {
        return this.recipients;
    }

    /**
     * CLDR region code of the country/region of the address. This is never inferred and it is up to the user to ensure the value is correct. See http://cldr.unicode.org/ and http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details. Example: "CH" for Switzerland.
     * 
     */
    @Import(name="regionCode", required=true)
      private final String regionCode;

    public String regionCode() {
        return this.regionCode;
    }

    /**
     * The schema revision of the `PostalAddress`. This must be set to 0, which is the latest revision. All new revisions **must** be backward compatible with old revisions.
     * 
     */
    @Import(name="revision", required=true)
      private final Integer revision;

    public Integer revision() {
        return this.revision;
    }

    /**
     * Optional. Additional, country-specific, sorting code. This is not used in most regions. Where it is used, the value is either a string like "CEDEX", optionally followed by a number (e.g. "CEDEX 7"), or just a number alone, representing the "sector code" (Jamaica), "delivery area indicator" (Malawi) or "post office indicator" (e.g. Côte d'Ivoire).
     * 
     */
    @Import(name="sortingCode", required=true)
      private final String sortingCode;

    public String sortingCode() {
        return this.sortingCode;
    }

    /**
     * Optional. Sublocality of the address. For example, this can be neighborhoods, boroughs, districts.
     * 
     */
    @Import(name="sublocality", required=true)
      private final String sublocality;

    public String sublocality() {
        return this.sublocality;
    }

    public PostalAddressResponse(
        List<String> addressLines,
        String administrativeArea,
        String languageCode,
        String locality,
        String organization,
        String postalCode,
        List<String> recipients,
        String regionCode,
        Integer revision,
        String sortingCode,
        String sublocality) {
        this.addressLines = Objects.requireNonNull(addressLines, "expected parameter 'addressLines' to be non-null");
        this.administrativeArea = Objects.requireNonNull(administrativeArea, "expected parameter 'administrativeArea' to be non-null");
        this.languageCode = Objects.requireNonNull(languageCode, "expected parameter 'languageCode' to be non-null");
        this.locality = Objects.requireNonNull(locality, "expected parameter 'locality' to be non-null");
        this.organization = Objects.requireNonNull(organization, "expected parameter 'organization' to be non-null");
        this.postalCode = Objects.requireNonNull(postalCode, "expected parameter 'postalCode' to be non-null");
        this.recipients = Objects.requireNonNull(recipients, "expected parameter 'recipients' to be non-null");
        this.regionCode = Objects.requireNonNull(regionCode, "expected parameter 'regionCode' to be non-null");
        this.revision = Objects.requireNonNull(revision, "expected parameter 'revision' to be non-null");
        this.sortingCode = Objects.requireNonNull(sortingCode, "expected parameter 'sortingCode' to be non-null");
        this.sublocality = Objects.requireNonNull(sublocality, "expected parameter 'sublocality' to be non-null");
    }

    private PostalAddressResponse() {
        this.addressLines = List.of();
        this.administrativeArea = null;
        this.languageCode = null;
        this.locality = null;
        this.organization = null;
        this.postalCode = null;
        this.recipients = List.of();
        this.regionCode = null;
        this.revision = null;
        this.sortingCode = null;
        this.sublocality = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PostalAddressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> addressLines;
        private String administrativeArea;
        private String languageCode;
        private String locality;
        private String organization;
        private String postalCode;
        private List<String> recipients;
        private String regionCode;
        private Integer revision;
        private String sortingCode;
        private String sublocality;

        public Builder() {
    	      // Empty
        }

        public Builder(PostalAddressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressLines = defaults.addressLines;
    	      this.administrativeArea = defaults.administrativeArea;
    	      this.languageCode = defaults.languageCode;
    	      this.locality = defaults.locality;
    	      this.organization = defaults.organization;
    	      this.postalCode = defaults.postalCode;
    	      this.recipients = defaults.recipients;
    	      this.regionCode = defaults.regionCode;
    	      this.revision = defaults.revision;
    	      this.sortingCode = defaults.sortingCode;
    	      this.sublocality = defaults.sublocality;
        }

        public Builder addressLines(List<String> addressLines) {
            this.addressLines = Objects.requireNonNull(addressLines);
            return this;
        }
        public Builder addressLines(String... addressLines) {
            return addressLines(List.of(addressLines));
        }
        public Builder administrativeArea(String administrativeArea) {
            this.administrativeArea = Objects.requireNonNull(administrativeArea);
            return this;
        }
        public Builder languageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }
        public Builder locality(String locality) {
            this.locality = Objects.requireNonNull(locality);
            return this;
        }
        public Builder organization(String organization) {
            this.organization = Objects.requireNonNull(organization);
            return this;
        }
        public Builder postalCode(String postalCode) {
            this.postalCode = Objects.requireNonNull(postalCode);
            return this;
        }
        public Builder recipients(List<String> recipients) {
            this.recipients = Objects.requireNonNull(recipients);
            return this;
        }
        public Builder recipients(String... recipients) {
            return recipients(List.of(recipients));
        }
        public Builder regionCode(String regionCode) {
            this.regionCode = Objects.requireNonNull(regionCode);
            return this;
        }
        public Builder revision(Integer revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }
        public Builder sortingCode(String sortingCode) {
            this.sortingCode = Objects.requireNonNull(sortingCode);
            return this;
        }
        public Builder sublocality(String sublocality) {
            this.sublocality = Objects.requireNonNull(sublocality);
            return this;
        }        public PostalAddressResponse build() {
            return new PostalAddressResponse(addressLines, administrativeArea, languageCode, locality, organization, postalCode, recipients, regionCode, revision, sortingCode, sublocality);
        }
    }
}
