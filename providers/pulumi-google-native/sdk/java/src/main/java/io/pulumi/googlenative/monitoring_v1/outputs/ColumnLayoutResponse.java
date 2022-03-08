// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v1.outputs.ColumnResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ColumnLayoutResponse {
    /**
     * The columns of content to display.
     * 
     */
    private final List<ColumnResponse> columns;

    @OutputCustomType.Constructor({"columns"})
    private ColumnLayoutResponse(List<ColumnResponse> columns) {
        this.columns = columns;
    }

    /**
     * The columns of content to display.
     * 
    */
    public List<ColumnResponse> getColumns() {
        return this.columns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ColumnLayoutResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ColumnResponse> columns;

        public Builder() {
    	      // Empty
        }

        public Builder(ColumnLayoutResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
        }

        public Builder setColumns(List<ColumnResponse> columns) {
            this.columns = Objects.requireNonNull(columns);
            return this;
        }
        public ColumnLayoutResponse build() {
            return new ColumnLayoutResponse(columns);
        }
    }
}
