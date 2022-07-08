// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.transcoder.v1.outputs.AnimationEndResponse;
import com.pulumi.googlenative.transcoder.v1.outputs.AnimationFadeResponse;
import com.pulumi.googlenative.transcoder.v1.outputs.AnimationStaticResponse;
import java.util.Objects;

@CustomType
public final class AnimationResponse {
    /**
     * @return End previous animation.
     * 
     */
    private final AnimationEndResponse animationEnd;
    /**
     * @return Display overlay object with fade animation.
     * 
     */
    private final AnimationFadeResponse animationFade;
    /**
     * @return Display static overlay object.
     * 
     */
    private final AnimationStaticResponse animationStatic;

    @CustomType.Constructor
    private AnimationResponse(
        @CustomType.Parameter("animationEnd") AnimationEndResponse animationEnd,
        @CustomType.Parameter("animationFade") AnimationFadeResponse animationFade,
        @CustomType.Parameter("animationStatic") AnimationStaticResponse animationStatic) {
        this.animationEnd = animationEnd;
        this.animationFade = animationFade;
        this.animationStatic = animationStatic;
    }

    /**
     * @return End previous animation.
     * 
     */
    public AnimationEndResponse animationEnd() {
        return this.animationEnd;
    }
    /**
     * @return Display overlay object with fade animation.
     * 
     */
    public AnimationFadeResponse animationFade() {
        return this.animationFade;
    }
    /**
     * @return Display static overlay object.
     * 
     */
    public AnimationStaticResponse animationStatic() {
        return this.animationStatic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnimationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnimationEndResponse animationEnd;
        private AnimationFadeResponse animationFade;
        private AnimationStaticResponse animationStatic;

        public Builder() {
    	      // Empty
        }

        public Builder(AnimationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.animationEnd = defaults.animationEnd;
    	      this.animationFade = defaults.animationFade;
    	      this.animationStatic = defaults.animationStatic;
        }

        public Builder animationEnd(AnimationEndResponse animationEnd) {
            this.animationEnd = Objects.requireNonNull(animationEnd);
            return this;
        }
        public Builder animationFade(AnimationFadeResponse animationFade) {
            this.animationFade = Objects.requireNonNull(animationFade);
            return this;
        }
        public Builder animationStatic(AnimationStaticResponse animationStatic) {
            this.animationStatic = Objects.requireNonNull(animationStatic);
            return this;
        }        public AnimationResponse build() {
            return new AnimationResponse(animationEnd, animationFade, animationStatic);
        }
    }
}
