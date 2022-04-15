// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cur.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReportDefinitionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetReportDefinitionArgs Empty = new GetReportDefinitionArgs();

    /**
     * The name of the report definition to match.
     * 
     */
    @Import(name="reportName", required=true)
      private final String reportName;

    public String reportName() {
        return this.reportName;
    }

    public GetReportDefinitionArgs(String reportName) {
        this.reportName = Objects.requireNonNull(reportName, "expected parameter 'reportName' to be non-null");
    }

    private GetReportDefinitionArgs() {
        this.reportName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReportDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String reportName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReportDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.reportName = defaults.reportName;
        }

        public Builder reportName(String reportName) {
            this.reportName = Objects.requireNonNull(reportName);
            return this;
        }        public GetReportDefinitionArgs build() {
            return new GetReportDefinitionArgs(reportName);
        }
    }
}
