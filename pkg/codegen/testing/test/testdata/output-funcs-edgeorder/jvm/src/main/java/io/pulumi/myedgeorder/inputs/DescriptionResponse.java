// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.myedgeorder.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.myedgeorder.inputs.LinkResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Description related properties of a product system.
 * 
 */
public final class DescriptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final DescriptionResponse Empty = new DescriptionResponse();

    /**
     * Attributes for the product system.
     * 
     */
    @InputImport(name="attributes", required=true)
    private final List<String> attributes;

    public List<String> getAttributes() {
        return this.attributes;
    }

    /**
     * Type of description.
     * 
     */
    @InputImport(name="descriptionType", required=true)
    private final String descriptionType;

    public String getDescriptionType() {
        return this.descriptionType;
    }

    /**
     * Keywords for the product system.
     * 
     */
    @InputImport(name="keywords", required=true)
    private final List<String> keywords;

    public List<String> getKeywords() {
        return this.keywords;
    }

    /**
     * Links for the product system.
     * 
     */
    @InputImport(name="links", required=true)
    private final List<LinkResponse> links;

    public List<LinkResponse> getLinks() {
        return this.links;
    }

    /**
     * Long description of the product system.
     * 
     */
    @InputImport(name="longDescription", required=true)
    private final String longDescription;

    public String getLongDescription() {
        return this.longDescription;
    }

    /**
     * Short description of the product system.
     * 
     */
    @InputImport(name="shortDescription", required=true)
    private final String shortDescription;

    public String getShortDescription() {
        return this.shortDescription;
    }

    public DescriptionResponse(
        List<String> attributes,
        String descriptionType,
        List<String> keywords,
        List<LinkResponse> links,
        String longDescription,
        String shortDescription) {
        this.attributes = Objects.requireNonNull(attributes, "expected parameter 'attributes' to be non-null");
        this.descriptionType = Objects.requireNonNull(descriptionType, "expected parameter 'descriptionType' to be non-null");
        this.keywords = Objects.requireNonNull(keywords, "expected parameter 'keywords' to be non-null");
        this.links = Objects.requireNonNull(links, "expected parameter 'links' to be non-null");
        this.longDescription = Objects.requireNonNull(longDescription, "expected parameter 'longDescription' to be non-null");
        this.shortDescription = Objects.requireNonNull(shortDescription, "expected parameter 'shortDescription' to be non-null");
    }

    private DescriptionResponse() {
        this.attributes = List.of();
        this.descriptionType = null;
        this.keywords = List.of();
        this.links = List.of();
        this.longDescription = null;
        this.shortDescription = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> attributes;
        private String descriptionType;
        private List<String> keywords;
        private List<LinkResponse> links;
        private String longDescription;
        private String shortDescription;

        public Builder() {
    	      // Empty
        }

        public Builder(DescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.descriptionType = defaults.descriptionType;
    	      this.keywords = defaults.keywords;
    	      this.links = defaults.links;
    	      this.longDescription = defaults.longDescription;
    	      this.shortDescription = defaults.shortDescription;
        }

        public Builder setAttributes(List<String> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder setDescriptionType(String descriptionType) {
            this.descriptionType = Objects.requireNonNull(descriptionType);
            return this;
        }

        public Builder setKeywords(List<String> keywords) {
            this.keywords = Objects.requireNonNull(keywords);
            return this;
        }

        public Builder setLinks(List<LinkResponse> links) {
            this.links = Objects.requireNonNull(links);
            return this;
        }

        public Builder setLongDescription(String longDescription) {
            this.longDescription = Objects.requireNonNull(longDescription);
            return this;
        }

        public Builder setShortDescription(String shortDescription) {
            this.shortDescription = Objects.requireNonNull(shortDescription);
            return this;
        }

        public DescriptionResponse build() {
            return new DescriptionResponse(attributes, descriptionType, keywords, links, longDescription, shortDescription);
        }
    }
}
