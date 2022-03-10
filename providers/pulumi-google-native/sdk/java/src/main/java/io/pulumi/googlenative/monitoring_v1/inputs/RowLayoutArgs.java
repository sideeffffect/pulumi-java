// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v1.inputs.RowArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A simplified layout that divides the available space into rows and arranges a set of widgets horizontally in each row.
 * 
 */
public final class RowLayoutArgs extends io.pulumi.resources.ResourceArgs {

    public static final RowLayoutArgs Empty = new RowLayoutArgs();

    /**
     * The rows of content to display.
     * 
     */
    @InputImport(name="rows")
      private final @Nullable Input<List<RowArgs>> rows;

    public Input<List<RowArgs>> getRows() {
        return this.rows == null ? Input.empty() : this.rows;
    }

    public RowLayoutArgs(@Nullable Input<List<RowArgs>> rows) {
        this.rows = rows;
    }

    private RowLayoutArgs() {
        this.rows = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RowLayoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<RowArgs>> rows;

        public Builder() {
    	      // Empty
        }

        public Builder(RowLayoutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rows = defaults.rows;
        }

        public Builder rows(@Nullable Input<List<RowArgs>> rows) {
            this.rows = rows;
            return this;
        }

        public Builder rows(@Nullable List<RowArgs> rows) {
            this.rows = Input.ofNullable(rows);
            return this;
        }
        public RowLayoutArgs build() {
            return new RowLayoutArgs(rows);
        }
    }
}
