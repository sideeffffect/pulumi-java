// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * DocumentOccurrence represents an SPDX Document Creation Information section: https://spdx.github.io/spdx-spec/2-document-creation-information/
 * 
 */
public final class DocumentOccurrenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final DocumentOccurrenceResponse Empty = new DocumentOccurrenceResponse();

    /**
     * Identify when the SPDX file was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard
     * 
     */
    @Import(name="createTime", required=true)
    private String createTime;

    public String createTime() {
        return this.createTime;
    }

    /**
     * A field for creators of the SPDX file to provide general comments about the creation of the SPDX file or any other relevant comment not included in the other fields
     * 
     */
    @Import(name="creatorComment", required=true)
    private String creatorComment;

    public String creatorComment() {
        return this.creatorComment;
    }

    /**
     * Identify who (or what, in the case of a tool) created the SPDX file. If the SPDX file was created by an individual, indicate the person&#39;s name
     * 
     */
    @Import(name="creators", required=true)
    private List<String> creators;

    public List<String> creators() {
        return this.creators;
    }

    /**
     * A field for creators of the SPDX file content to provide comments to the consumers of the SPDX document
     * 
     */
    @Import(name="documentComment", required=true)
    private String documentComment;

    public String documentComment() {
        return this.documentComment;
    }

    /**
     * Identify any external SPDX documents referenced within this SPDX document
     * 
     */
    @Import(name="externalDocumentRefs", required=true)
    private List<String> externalDocumentRefs;

    public List<String> externalDocumentRefs() {
        return this.externalDocumentRefs;
    }

    /**
     * A field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created
     * 
     */
    @Import(name="licenseListVersion", required=true)
    private String licenseListVersion;

    public String licenseListVersion() {
        return this.licenseListVersion;
    }

    /**
     * Provide an SPDX document specific namespace as a unique absolute Uniform Resource Identifier (URI) as specified in RFC-3986, with the exception of the ‘#’ delimiter
     * 
     */
    @Import(name="namespace", required=true)
    private String namespace;

    public String namespace() {
        return this.namespace;
    }

    /**
     * Identify name of this document as designated by creator
     * 
     */
    @Import(name="title", required=true)
    private String title;

    public String title() {
        return this.title;
    }

    private DocumentOccurrenceResponse() {}

    private DocumentOccurrenceResponse(DocumentOccurrenceResponse $) {
        this.createTime = $.createTime;
        this.creatorComment = $.creatorComment;
        this.creators = $.creators;
        this.documentComment = $.documentComment;
        this.externalDocumentRefs = $.externalDocumentRefs;
        this.licenseListVersion = $.licenseListVersion;
        this.namespace = $.namespace;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DocumentOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DocumentOccurrenceResponse $;

        public Builder() {
            $ = new DocumentOccurrenceResponse();
        }

        public Builder(DocumentOccurrenceResponse defaults) {
            $ = new DocumentOccurrenceResponse(Objects.requireNonNull(defaults));
        }

        public Builder createTime(String createTime) {
            $.createTime = createTime;
            return this;
        }

        public Builder creatorComment(String creatorComment) {
            $.creatorComment = creatorComment;
            return this;
        }

        public Builder creators(List<String> creators) {
            $.creators = creators;
            return this;
        }

        public Builder creators(String... creators) {
            return creators(List.of(creators));
        }

        public Builder documentComment(String documentComment) {
            $.documentComment = documentComment;
            return this;
        }

        public Builder externalDocumentRefs(List<String> externalDocumentRefs) {
            $.externalDocumentRefs = externalDocumentRefs;
            return this;
        }

        public Builder externalDocumentRefs(String... externalDocumentRefs) {
            return externalDocumentRefs(List.of(externalDocumentRefs));
        }

        public Builder licenseListVersion(String licenseListVersion) {
            $.licenseListVersion = licenseListVersion;
            return this;
        }

        public Builder namespace(String namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder title(String title) {
            $.title = title;
            return this;
        }

        public DocumentOccurrenceResponse build() {
            $.createTime = Objects.requireNonNull($.createTime, "expected parameter 'createTime' to be non-null");
            $.creatorComment = Objects.requireNonNull($.creatorComment, "expected parameter 'creatorComment' to be non-null");
            $.creators = Objects.requireNonNull($.creators, "expected parameter 'creators' to be non-null");
            $.documentComment = Objects.requireNonNull($.documentComment, "expected parameter 'documentComment' to be non-null");
            $.externalDocumentRefs = Objects.requireNonNull($.externalDocumentRefs, "expected parameter 'externalDocumentRefs' to be non-null");
            $.licenseListVersion = Objects.requireNonNull($.licenseListVersion, "expected parameter 'licenseListVersion' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            return $;
        }
    }

}
