// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v1.inputs.WidgetResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Defines the layout properties and content for a column.
 * 
 */
public final class ColumnResponse extends io.pulumi.resources.InvokeArgs {

    public static final ColumnResponse Empty = new ColumnResponse();

    /**
     * The relative weight of this column. The column weight is used to adjust the width of columns on the screen (relative to peers). Greater the weight, greater the width of the column on the screen. If omitted, a value of 1 is used while rendering.
     * 
     */
    @InputImport(name="weight", required=true)
      private final String weight;

    public String getWeight() {
        return this.weight;
    }

    /**
     * The display widgets arranged vertically in this column.
     * 
     */
    @InputImport(name="widgets", required=true)
      private final List<WidgetResponse> widgets;

    public List<WidgetResponse> getWidgets() {
        return this.widgets;
    }

    public ColumnResponse(
        String weight,
        List<WidgetResponse> widgets) {
        this.weight = Objects.requireNonNull(weight, "expected parameter 'weight' to be non-null");
        this.widgets = Objects.requireNonNull(widgets, "expected parameter 'widgets' to be non-null");
    }

    private ColumnResponse() {
        this.weight = null;
        this.widgets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ColumnResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String weight;
        private List<WidgetResponse> widgets;

        public Builder() {
    	      // Empty
        }

        public Builder(ColumnResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.weight = defaults.weight;
    	      this.widgets = defaults.widgets;
        }

        public Builder weight(String weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }

        public Builder widgets(List<WidgetResponse> widgets) {
            this.widgets = Objects.requireNonNull(widgets);
            return this;
        }
        public ColumnResponse build() {
            return new ColumnResponse(weight, widgets);
        }
    }
}
