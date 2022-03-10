// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.auditmanager.inputs;

import io.pulumi.awsnative.auditmanager.enums.AssessmentReportDestinationType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The destination in which evidence reports are stored for the specified assessment.
 * 
 */
public final class AssessmentReportsDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssessmentReportsDestinationArgs Empty = new AssessmentReportsDestinationArgs();

    @InputImport(name="destination")
      private final @Nullable Input<String> destination;

    public Input<String> getDestination() {
        return this.destination == null ? Input.empty() : this.destination;
    }

    @InputImport(name="destinationType")
      private final @Nullable Input<AssessmentReportDestinationType> destinationType;

    public Input<AssessmentReportDestinationType> getDestinationType() {
        return this.destinationType == null ? Input.empty() : this.destinationType;
    }

    public AssessmentReportsDestinationArgs(
        @Nullable Input<String> destination,
        @Nullable Input<AssessmentReportDestinationType> destinationType) {
        this.destination = destination;
        this.destinationType = destinationType;
    }

    private AssessmentReportsDestinationArgs() {
        this.destination = Input.empty();
        this.destinationType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentReportsDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> destination;
        private @Nullable Input<AssessmentReportDestinationType> destinationType;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentReportsDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.destinationType = defaults.destinationType;
        }

        public Builder destination(@Nullable Input<String> destination) {
            this.destination = destination;
            return this;
        }

        public Builder destination(@Nullable String destination) {
            this.destination = Input.ofNullable(destination);
            return this;
        }

        public Builder destinationType(@Nullable Input<AssessmentReportDestinationType> destinationType) {
            this.destinationType = destinationType;
            return this;
        }

        public Builder destinationType(@Nullable AssessmentReportDestinationType destinationType) {
            this.destinationType = Input.ofNullable(destinationType);
            return this;
        }
        public AssessmentReportsDestinationArgs build() {
            return new AssessmentReportsDestinationArgs(destination, destinationType);
        }
    }
}
