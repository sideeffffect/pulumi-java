// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.NonCompliantFileResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ComplianceOccurrenceResponse {
    private final String nonComplianceReason;
    private final List<NonCompliantFileResponse> nonCompliantFiles;

    @OutputCustomType.Constructor
    private ComplianceOccurrenceResponse(
        @OutputCustomType.Parameter("nonComplianceReason") String nonComplianceReason,
        @OutputCustomType.Parameter("nonCompliantFiles") List<NonCompliantFileResponse> nonCompliantFiles) {
        this.nonComplianceReason = nonComplianceReason;
        this.nonCompliantFiles = nonCompliantFiles;
    }

    public String getNonComplianceReason() {
        return this.nonComplianceReason;
    }
    public List<NonCompliantFileResponse> getNonCompliantFiles() {
        return this.nonCompliantFiles;
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
        public ComplianceOccurrenceResponse build() {
            return new ComplianceOccurrenceResponse(nonComplianceReason, nonCompliantFiles);
        }
    }
}
