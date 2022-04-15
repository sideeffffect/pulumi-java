// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs Empty = new URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs();

    /**
     * The name of the header to add.
     * 
     */
    @Import(name="headerName")
      private final @Nullable Output<String> headerName;

    public Output<String> headerName() {
        return this.headerName == null ? Codegen.empty() : this.headerName;
    }

    /**
     * The value of the header to add.
     * 
     */
    @Import(name="headerValue")
      private final @Nullable Output<String> headerValue;

    public Output<String> headerValue() {
        return this.headerValue == null ? Codegen.empty() : this.headerValue;
    }

    /**
     * If false, headerValue is appended to any values that already exist for the header.
     * If true, headerValue is set for the header, discarding any values that were set for that header.
     * 
     */
    @Import(name="replace")
      private final @Nullable Output<Boolean> replace;

    public Output<Boolean> replace() {
        return this.replace == null ? Codegen.empty() : this.replace;
    }

    public URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs(
        @Nullable Output<String> headerName,
        @Nullable Output<String> headerValue,
        @Nullable Output<Boolean> replace) {
        this.headerName = headerName;
        this.headerValue = headerValue;
        this.replace = replace;
    }

    private URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs() {
        this.headerName = Codegen.empty();
        this.headerValue = Codegen.empty();
        this.replace = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> headerName;
        private @Nullable Output<String> headerValue;
        private @Nullable Output<Boolean> replace;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
    	      this.replace = defaults.replace;
        }

        public Builder headerName(@Nullable Output<String> headerName) {
            this.headerName = headerName;
            return this;
        }
        public Builder headerName(@Nullable String headerName) {
            this.headerName = Codegen.ofNullable(headerName);
            return this;
        }
        public Builder headerValue(@Nullable Output<String> headerValue) {
            this.headerValue = headerValue;
            return this;
        }
        public Builder headerValue(@Nullable String headerValue) {
            this.headerValue = Codegen.ofNullable(headerValue);
            return this;
        }
        public Builder replace(@Nullable Output<Boolean> replace) {
            this.replace = replace;
            return this;
        }
        public Builder replace(@Nullable Boolean replace) {
            this.replace = Codegen.ofNullable(replace);
            return this;
        }        public URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs build() {
            return new URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs(headerName, headerValue, replace);
        }
    }
}
