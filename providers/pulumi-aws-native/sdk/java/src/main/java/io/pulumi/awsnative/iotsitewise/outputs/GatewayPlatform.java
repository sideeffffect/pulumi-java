// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.awsnative.iotsitewise.outputs.GatewayGreengrass;
import io.pulumi.awsnative.iotsitewise.outputs.GatewayGreengrassV2;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GatewayPlatform {
    /**
     * A gateway that runs on AWS IoT Greengrass V1.
     * 
     */
    private final @Nullable GatewayGreengrass greengrass;
    /**
     * A gateway that runs on AWS IoT Greengrass V2.
     * 
     */
    private final @Nullable GatewayGreengrassV2 greengrassV2;

    @OutputCustomType.Constructor
    private GatewayPlatform(
        @OutputCustomType.Parameter("greengrass") @Nullable GatewayGreengrass greengrass,
        @OutputCustomType.Parameter("greengrassV2") @Nullable GatewayGreengrassV2 greengrassV2) {
        this.greengrass = greengrass;
        this.greengrassV2 = greengrassV2;
    }

    /**
     * A gateway that runs on AWS IoT Greengrass V1.
     * 
    */
    public Optional<GatewayGreengrass> getGreengrass() {
        return Optional.ofNullable(this.greengrass);
    }
    /**
     * A gateway that runs on AWS IoT Greengrass V2.
     * 
    */
    public Optional<GatewayGreengrassV2> getGreengrassV2() {
        return Optional.ofNullable(this.greengrassV2);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayPlatform defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GatewayGreengrass greengrass;
        private @Nullable GatewayGreengrassV2 greengrassV2;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayPlatform defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.greengrass = defaults.greengrass;
    	      this.greengrassV2 = defaults.greengrassV2;
        }

        public Builder greengrass(@Nullable GatewayGreengrass greengrass) {
            this.greengrass = greengrass;
            return this;
        }

        public Builder greengrassV2(@Nullable GatewayGreengrassV2 greengrassV2) {
            this.greengrassV2 = greengrassV2;
            return this;
        }
        public GatewayPlatform build() {
            return new GatewayPlatform(greengrass, greengrassV2);
        }
    }
}
