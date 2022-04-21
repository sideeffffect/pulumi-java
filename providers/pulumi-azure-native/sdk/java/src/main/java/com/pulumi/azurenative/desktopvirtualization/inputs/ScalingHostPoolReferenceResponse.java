// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.desktopvirtualization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Scaling plan reference to hostpool.
 * 
 */
public final class ScalingHostPoolReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScalingHostPoolReferenceResponse Empty = new ScalingHostPoolReferenceResponse();

    /**
     * Arm path of referenced hostpool.
     * 
     */
    @Import(name="hostPoolArmPath")
    private @Nullable String hostPoolArmPath;

    public Optional<String> hostPoolArmPath() {
        return Optional.ofNullable(this.hostPoolArmPath);
    }

    /**
     * Is the scaling plan enabled for this hostpool.
     * 
     */
    @Import(name="scalingPlanEnabled")
    private @Nullable Boolean scalingPlanEnabled;

    public Optional<Boolean> scalingPlanEnabled() {
        return Optional.ofNullable(this.scalingPlanEnabled);
    }

    private ScalingHostPoolReferenceResponse() {}

    private ScalingHostPoolReferenceResponse(ScalingHostPoolReferenceResponse $) {
        this.hostPoolArmPath = $.hostPoolArmPath;
        this.scalingPlanEnabled = $.scalingPlanEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScalingHostPoolReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScalingHostPoolReferenceResponse $;

        public Builder() {
            $ = new ScalingHostPoolReferenceResponse();
        }

        public Builder(ScalingHostPoolReferenceResponse defaults) {
            $ = new ScalingHostPoolReferenceResponse(Objects.requireNonNull(defaults));
        }

        public Builder hostPoolArmPath(@Nullable String hostPoolArmPath) {
            $.hostPoolArmPath = hostPoolArmPath;
            return this;
        }

        public Builder scalingPlanEnabled(@Nullable Boolean scalingPlanEnabled) {
            $.scalingPlanEnabled = scalingPlanEnabled;
            return this;
        }

        public ScalingHostPoolReferenceResponse build() {
            return $;
        }
    }

}
