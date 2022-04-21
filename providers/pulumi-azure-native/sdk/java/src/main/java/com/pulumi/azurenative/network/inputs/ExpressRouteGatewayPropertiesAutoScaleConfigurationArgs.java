// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ExpressRouteGatewayPropertiesBoundsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for auto scaling.
 * 
 */
public final class ExpressRouteGatewayPropertiesAutoScaleConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExpressRouteGatewayPropertiesAutoScaleConfigurationArgs Empty = new ExpressRouteGatewayPropertiesAutoScaleConfigurationArgs();

    /**
     * Minimum and maximum number of scale units to deploy.
     * 
     */
    @Import(name="bounds")
    private @Nullable Output<ExpressRouteGatewayPropertiesBoundsArgs> bounds;

    public Optional<Output<ExpressRouteGatewayPropertiesBoundsArgs>> bounds() {
        return Optional.ofNullable(this.bounds);
    }

    private ExpressRouteGatewayPropertiesAutoScaleConfigurationArgs() {}

    private ExpressRouteGatewayPropertiesAutoScaleConfigurationArgs(ExpressRouteGatewayPropertiesAutoScaleConfigurationArgs $) {
        this.bounds = $.bounds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExpressRouteGatewayPropertiesAutoScaleConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpressRouteGatewayPropertiesAutoScaleConfigurationArgs $;

        public Builder() {
            $ = new ExpressRouteGatewayPropertiesAutoScaleConfigurationArgs();
        }

        public Builder(ExpressRouteGatewayPropertiesAutoScaleConfigurationArgs defaults) {
            $ = new ExpressRouteGatewayPropertiesAutoScaleConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder bounds(@Nullable Output<ExpressRouteGatewayPropertiesBoundsArgs> bounds) {
            $.bounds = bounds;
            return this;
        }

        public Builder bounds(ExpressRouteGatewayPropertiesBoundsArgs bounds) {
            return bounds(Output.of(bounds));
        }

        public ExpressRouteGatewayPropertiesAutoScaleConfigurationArgs build() {
            return $;
        }
    }

}
