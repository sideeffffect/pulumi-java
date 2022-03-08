// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v1.outputs.WidgetResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RowResponse {
    /**
     * The relative weight of this row. The row weight is used to adjust the height of rows on the screen (relative to peers). Greater the weight, greater the height of the row on the screen. If omitted, a value of 1 is used while rendering.
     * 
     */
    private final String weight;
    /**
     * The display widgets arranged horizontally in this row.
     * 
     */
    private final List<WidgetResponse> widgets;

    @OutputCustomType.Constructor({"weight","widgets"})
    private RowResponse(
        String weight,
        List<WidgetResponse> widgets) {
        this.weight = weight;
        this.widgets = widgets;
    }

    /**
     * The relative weight of this row. The row weight is used to adjust the height of rows on the screen (relative to peers). Greater the weight, greater the height of the row on the screen. If omitted, a value of 1 is used while rendering.
     * 
    */
    public String getWeight() {
        return this.weight;
    }
    /**
     * The display widgets arranged horizontally in this row.
     * 
    */
    public List<WidgetResponse> getWidgets() {
        return this.widgets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String weight;
        private List<WidgetResponse> widgets;

        public Builder() {
    	      // Empty
        }

        public Builder(RowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.weight = defaults.weight;
    	      this.widgets = defaults.widgets;
        }

        public Builder setWeight(String weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }

        public Builder setWidgets(List<WidgetResponse> widgets) {
            this.widgets = Objects.requireNonNull(widgets);
            return this;
        }
        public RowResponse build() {
            return new RowResponse(weight, widgets);
        }
    }
}
