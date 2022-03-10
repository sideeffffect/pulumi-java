// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;


/**
 * Object to define the number of days after creation.
 * 
 */
public final class DateAfterCreationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DateAfterCreationArgs Empty = new DateAfterCreationArgs();

    /**
     * Value indicating the age in days after creation
     * 
     */
    @InputImport(name="daysAfterCreationGreaterThan", required=true)
      private final Input<Double> daysAfterCreationGreaterThan;

    public Input<Double> getDaysAfterCreationGreaterThan() {
        return this.daysAfterCreationGreaterThan;
    }

    public DateAfterCreationArgs(Input<Double> daysAfterCreationGreaterThan) {
        this.daysAfterCreationGreaterThan = Objects.requireNonNull(daysAfterCreationGreaterThan, "expected parameter 'daysAfterCreationGreaterThan' to be non-null");
    }

    private DateAfterCreationArgs() {
        this.daysAfterCreationGreaterThan = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DateAfterCreationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Double> daysAfterCreationGreaterThan;

        public Builder() {
    	      // Empty
        }

        public Builder(DateAfterCreationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysAfterCreationGreaterThan = defaults.daysAfterCreationGreaterThan;
        }

        public Builder daysAfterCreationGreaterThan(Input<Double> daysAfterCreationGreaterThan) {
            this.daysAfterCreationGreaterThan = Objects.requireNonNull(daysAfterCreationGreaterThan);
            return this;
        }

        public Builder daysAfterCreationGreaterThan(Double daysAfterCreationGreaterThan) {
            this.daysAfterCreationGreaterThan = Input.of(Objects.requireNonNull(daysAfterCreationGreaterThan));
            return this;
        }
        public DateAfterCreationArgs build() {
            return new DateAfterCreationArgs(daysAfterCreationGreaterThan);
        }
    }
}
