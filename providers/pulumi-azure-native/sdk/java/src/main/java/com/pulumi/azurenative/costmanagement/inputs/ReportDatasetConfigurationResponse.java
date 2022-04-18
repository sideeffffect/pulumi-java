// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration of dataset in the report.
 * 
 */
public final class ReportDatasetConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final ReportDatasetConfigurationResponse Empty = new ReportDatasetConfigurationResponse();

    /**
     * Array of column names to be included in the report. Any valid report column name is allowed. If not provided, then report includes all columns.
     * 
     */
    @Import(name="columns")
      private final @Nullable List<String> columns;

    public List<String> columns() {
        return this.columns == null ? List.of() : this.columns;
    }

    public ReportDatasetConfigurationResponse(@Nullable List<String> columns) {
        this.columns = columns;
    }

    private ReportDatasetConfigurationResponse() {
        this.columns = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDatasetConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> columns;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDatasetConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
        }

        public Builder columns(@Nullable List<String> columns) {
            this.columns = columns;
            return this;
        }
        public Builder columns(String... columns) {
            return columns(List.of(columns));
        }        public ReportDatasetConfigurationResponse build() {
            return new ReportDatasetConfigurationResponse(columns);
        }
    }
}
