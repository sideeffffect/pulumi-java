// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DocumentNoteResponse {
    /**
     * Compliance with the SPDX specification includes populating the SPDX fields therein with data related to such fields ("SPDX-Metadata")
     * 
     */
    private final String dataLicence;
    /**
     * Provide a reference number that can be used to understand how to parse and interpret the rest of the file
     * 
     */
    private final String spdxVersion;

    @CustomType.Constructor
    private DocumentNoteResponse(
        @CustomType.Parameter("dataLicence") String dataLicence,
        @CustomType.Parameter("spdxVersion") String spdxVersion) {
        this.dataLicence = dataLicence;
        this.spdxVersion = spdxVersion;
    }

    /**
     * Compliance with the SPDX specification includes populating the SPDX fields therein with data related to such fields ("SPDX-Metadata")
     * 
    */
    public String dataLicence() {
        return this.dataLicence;
    }
    /**
     * Provide a reference number that can be used to understand how to parse and interpret the rest of the file
     * 
    */
    public String spdxVersion() {
        return this.spdxVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataLicence;
        private String spdxVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataLicence = defaults.dataLicence;
    	      this.spdxVersion = defaults.spdxVersion;
        }

        public Builder dataLicence(String dataLicence) {
            this.dataLicence = Objects.requireNonNull(dataLicence);
            return this;
        }
        public Builder spdxVersion(String spdxVersion) {
            this.spdxVersion = Objects.requireNonNull(spdxVersion);
            return this;
        }        public DocumentNoteResponse build() {
            return new DocumentNoteResponse(dataLicence, spdxVersion);
        }
    }
}
