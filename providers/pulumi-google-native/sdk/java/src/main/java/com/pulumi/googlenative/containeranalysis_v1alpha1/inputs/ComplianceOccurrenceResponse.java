// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.NonCompliantFileResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An indication that the compliance checks in the associated ComplianceNote were not satisfied for particular resources or a specified reason.
 * 
 */
public final class ComplianceOccurrenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ComplianceOccurrenceResponse Empty = new ComplianceOccurrenceResponse();

    /**
     * The reason for non compliance of these files.
     * 
     */
    @Import(name="nonComplianceReason", required=true)
      private final String nonComplianceReason;

    public String nonComplianceReason() {
        return this.nonComplianceReason;
    }

    /**
     * A list of files which are violating compliance checks.
     * 
     */
    @Import(name="nonCompliantFiles", required=true)
      private final List<NonCompliantFileResponse> nonCompliantFiles;

    public List<NonCompliantFileResponse> nonCompliantFiles() {
        return this.nonCompliantFiles;
    }

    public ComplianceOccurrenceResponse(
        String nonComplianceReason,
        List<NonCompliantFileResponse> nonCompliantFiles) {
        this.nonComplianceReason = Objects.requireNonNull(nonComplianceReason, "expected parameter 'nonComplianceReason' to be non-null");
        this.nonCompliantFiles = Objects.requireNonNull(nonCompliantFiles, "expected parameter 'nonCompliantFiles' to be non-null");
    }

    private ComplianceOccurrenceResponse() {
        this.nonComplianceReason = null;
        this.nonCompliantFiles = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComplianceOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nonComplianceReason;
        private List<NonCompliantFileResponse> nonCompliantFiles;

        public Builder() {
    	      // Empty
        }

        public Builder(ComplianceOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonComplianceReason = defaults.nonComplianceReason;
    	      this.nonCompliantFiles = defaults.nonCompliantFiles;
        }

        public Builder nonComplianceReason(String nonComplianceReason) {
            this.nonComplianceReason = Objects.requireNonNull(nonComplianceReason);
            return this;
        }
        public Builder nonCompliantFiles(List<NonCompliantFileResponse> nonCompliantFiles) {
            this.nonCompliantFiles = Objects.requireNonNull(nonCompliantFiles);
            return this;
        }
        public Builder nonCompliantFiles(NonCompliantFileResponse... nonCompliantFiles) {
            return nonCompliantFiles(List.of(nonCompliantFiles));
        }        public ComplianceOccurrenceResponse build() {
            return new ComplianceOccurrenceResponse(nonComplianceReason, nonCompliantFiles);
        }
    }
}
