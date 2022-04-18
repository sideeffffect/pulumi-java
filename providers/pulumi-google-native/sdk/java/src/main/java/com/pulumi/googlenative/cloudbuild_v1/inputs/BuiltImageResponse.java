// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudbuild_v1.inputs.TimeSpanResponse;
import java.lang.String;
import java.util.Objects;


/**
 * An image built by the pipeline.
 * 
 */
public final class BuiltImageResponse extends com.pulumi.resources.InvokeArgs {

    public static final BuiltImageResponse Empty = new BuiltImageResponse();

    /**
     * Docker Registry 2.0 digest.
     * 
     */
    @Import(name="digest", required=true)
      private final String digest;

    public String digest() {
        return this.digest;
    }

    /**
     * Name used to push the container image to Google Container Registry, as presented to `docker push`.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Stores timing information for pushing the specified image.
     * 
     */
    @Import(name="pushTiming", required=true)
      private final TimeSpanResponse pushTiming;

    public TimeSpanResponse pushTiming() {
        return this.pushTiming;
    }

    public BuiltImageResponse(
        String digest,
        String name,
        TimeSpanResponse pushTiming) {
        this.digest = Objects.requireNonNull(digest, "expected parameter 'digest' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.pushTiming = Objects.requireNonNull(pushTiming, "expected parameter 'pushTiming' to be non-null");
    }

    private BuiltImageResponse() {
        this.digest = null;
        this.name = null;
        this.pushTiming = null;
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
        }        public BuiltImageResponse build() {
            return new BuiltImageResponse(digest, name, pushTiming);
        }
    }
}
