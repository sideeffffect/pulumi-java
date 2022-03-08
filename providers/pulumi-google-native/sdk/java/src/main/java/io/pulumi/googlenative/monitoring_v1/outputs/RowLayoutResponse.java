// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v1.outputs.RowResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RowLayoutResponse {
    /**
     * The rows of content to display.
     * 
     */
    private final List<RowResponse> rows;

    @OutputCustomType.Constructor({"rows"})
    private RowLayoutResponse(List<RowResponse> rows) {
        this.rows = rows;
    }

    /**
     * The rows of content to display.
     * 
    */
    public List<RowResponse> getRows() {
        return this.rows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RowLayoutResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RowResponse> rows;

        public Builder() {
    	      // Empty
        }

        public Builder(RowLayoutResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rows = defaults.rows;
        }

        public Builder setRows(List<RowResponse> rows) {
            this.rows = Objects.requireNonNull(rows);
            return this;
        }
        public RowLayoutResponse build() {
            return new RowLayoutResponse(rows);
        }
    }
}
