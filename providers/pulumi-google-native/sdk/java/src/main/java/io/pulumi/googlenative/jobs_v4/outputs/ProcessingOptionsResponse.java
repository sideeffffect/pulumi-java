// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ProcessingOptionsResponse {
    /**
     * If set to `true`, the service does not attempt to resolve a more precise address for the job.
     * 
     */
    private final Boolean disableStreetAddressResolution;
    /**
     * Option for job HTML content sanitization. Applied fields are: * description * applicationInfo.instruction * incentives * qualifications * responsibilities HTML tags in these fields may be stripped if sanitiazation isn't disabled. Defaults to HtmlSanitization.SIMPLE_FORMATTING_ONLY.
     * 
     */
    private final String htmlSanitization;

    @OutputCustomType.Constructor({"disableStreetAddressResolution","htmlSanitization"})
    private ProcessingOptionsResponse(
        Boolean disableStreetAddressResolution,
        String htmlSanitization) {
        this.disableStreetAddressResolution = disableStreetAddressResolution;
        this.htmlSanitization = htmlSanitization;
    }

    /**
     * If set to `true`, the service does not attempt to resolve a more precise address for the job.
     * 
    */
    public Boolean getDisableStreetAddressResolution() {
        return this.disableStreetAddressResolution;
    }
    /**
     * Option for job HTML content sanitization. Applied fields are: * description * applicationInfo.instruction * incentives * qualifications * responsibilities HTML tags in these fields may be stripped if sanitiazation isn't disabled. Defaults to HtmlSanitization.SIMPLE_FORMATTING_ONLY.
     * 
    */
    public String getHtmlSanitization() {
        return this.htmlSanitization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProcessingOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disableStreetAddressResolution;
        private String htmlSanitization;

        public Builder() {
    	      // Empty
        }

        public Builder(ProcessingOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableStreetAddressResolution = defaults.disableStreetAddressResolution;
    	      this.htmlSanitization = defaults.htmlSanitization;
        }

        public Builder setDisableStreetAddressResolution(Boolean disableStreetAddressResolution) {
            this.disableStreetAddressResolution = Objects.requireNonNull(disableStreetAddressResolution);
            return this;
        }

        public Builder setHtmlSanitization(String htmlSanitization) {
            this.htmlSanitization = Objects.requireNonNull(htmlSanitization);
            return this;
        }
        public ProcessingOptionsResponse build() {
            return new ProcessingOptionsResponse(disableStreetAddressResolution, htmlSanitization);
        }
    }
}
