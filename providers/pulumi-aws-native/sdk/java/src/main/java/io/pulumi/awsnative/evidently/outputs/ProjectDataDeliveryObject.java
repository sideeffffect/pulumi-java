// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.outputs;

import io.pulumi.awsnative.evidently.outputs.ProjectS3Destination;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProjectDataDeliveryObject {
    private final @Nullable String logGroup;
    private final @Nullable ProjectS3Destination s3;

    @OutputCustomType.Constructor
    private ProjectDataDeliveryObject(
        @OutputCustomType.Parameter("logGroup") @Nullable String logGroup,
        @OutputCustomType.Parameter("s3") @Nullable ProjectS3Destination s3) {
        this.logGroup = logGroup;
        this.s3 = s3;
    }

    public Optional<String> getLogGroup() {
        return Optional.ofNullable(this.logGroup);
    }
    public Optional<ProjectS3Destination> getS3() {
        return Optional.ofNullable(this.s3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectDataDeliveryObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String logGroup;
        private @Nullable ProjectS3Destination s3;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectDataDeliveryObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroup = defaults.logGroup;
    	      this.s3 = defaults.s3;
        }

        public Builder logGroup(@Nullable String logGroup) {
            this.logGroup = logGroup;
            return this;
        }

        public Builder s3(@Nullable ProjectS3Destination s3) {
            this.s3 = s3;
            return this;
        }
        public ProjectDataDeliveryObject build() {
            return new ProjectDataDeliveryObject(logGroup, s3);
        }
    }
}
