// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Reason and code for the compliance of the guest configuration assignment resource.
 * 
 */
public final class AssignmentReportResourceComplianceReasonResponse extends io.pulumi.resources.InvokeArgs {

    public static final AssignmentReportResourceComplianceReasonResponse Empty = new AssignmentReportResourceComplianceReasonResponse();

    /**
     * Code for the compliance of the guest configuration assignment resource.
     * 
     */
    @InputImport(name="code", required=true)
      private final String code;

    public String getCode() {
        return this.code;
    }

    /**
     * Reason for the compliance of the guest configuration assignment resource.
     * 
     */
    @InputImport(name="phrase", required=true)
      private final String phrase;

    public String getPhrase() {
        return this.phrase;
    }

    public AssignmentReportResourceComplianceReasonResponse(
        String code,
        String phrase) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.phrase = Objects.requireNonNull(phrase, "expected parameter 'phrase' to be non-null");
    }

    private AssignmentReportResourceComplianceReasonResponse() {
        this.code = null;
        this.phrase = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentReportResourceComplianceReasonResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String phrase;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentReportResourceComplianceReasonResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.phrase = defaults.phrase;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder phrase(String phrase) {
            this.phrase = Objects.requireNonNull(phrase);
            return this;
        }
        public AssignmentReportResourceComplianceReasonResponse build() {
            return new AssignmentReportResourceComplianceReasonResponse(code, phrase);
        }
    }
}
