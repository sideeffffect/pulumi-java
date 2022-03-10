// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudbuild_v1.outputs.TimeSpanResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BuiltImageResponse {
    /**
     * Docker Registry 2.0 digest.
     * 
     */
    private final String digest;
    /**
     * Name used to push the container image to Google Container Registry, as presented to `docker push`.
     * 
     */
    private final String name;
    /**
     * Stores timing information for pushing the specified image.
     * 
     */
    private final TimeSpanResponse pushTiming;

    @OutputCustomType.Constructor
    private BuiltImageResponse(
        @OutputCustomType.Parameter("digest") String digest,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("pushTiming") TimeSpanResponse pushTiming) {
        this.digest = digest;
        this.name = name;
        this.pushTiming = pushTiming;
    }

    /**
     * Docker Registry 2.0 digest.
     * 
    */
    public String getDigest() {
        return this.digest;
    }
    /**
     * Name used to push the container image to Google Container Registry, as presented to `docker push`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Stores timing information for pushing the specified image.
     * 
    */
    public TimeSpanResponse getPushTiming() {
        return this.pushTiming;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuiltImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String digest;
        private String name;
        private TimeSpanResponse pushTiming;

        public Builder() {
    	      // Empty
        }

        public Builder(BuiltImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.name = defaults.name;
    	      this.pushTiming = defaults.pushTiming;
        }

        public Builder digest(String digest) {
            this.digest = Objects.requireNonNull(digest);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder pushTiming(TimeSpanResponse pushTiming) {
            this.pushTiming = Objects.requireNonNull(pushTiming);
            return this;
        }
        public BuiltImageResponse build() {
            return new BuiltImageResponse(digest, name, pushTiming);
        }
    }
}
