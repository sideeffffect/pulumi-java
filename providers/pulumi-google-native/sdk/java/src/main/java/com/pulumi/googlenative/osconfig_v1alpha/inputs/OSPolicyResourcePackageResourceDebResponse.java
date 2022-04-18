// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceFileResponse;
import java.lang.Boolean;
import java.util.Objects;


/**
 * A deb package file. dpkg packages only support INSTALLED state.
 * 
 */
public final class OSPolicyResourcePackageResourceDebResponse extends com.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourcePackageResourceDebResponse Empty = new OSPolicyResourcePackageResourceDebResponse();

    /**
     * Whether dependencies should also be installed. - install when false: `dpkg -i package` - install when true: `apt-get update && apt-get -y install package.deb`
     * 
     */
    @Import(name="pullDeps", required=true)
      private final Boolean pullDeps;

    public Boolean pullDeps() {
        return this.pullDeps;
    }

    /**
     * A deb package.
     * 
     */
    @Import(name="source", required=true)
      private final OSPolicyResourceFileResponse source;

    public OSPolicyResourceFileResponse source() {
        return this.source;
    }

    public OSPolicyResourcePackageResourceDebResponse(
        Boolean pullDeps,
        OSPolicyResourceFileResponse source) {
        this.pullDeps = Objects.requireNonNull(pullDeps, "expected parameter 'pullDeps' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private OSPolicyResourcePackageResourceDebResponse() {
        this.pullDeps = null;
        this.source = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceDebResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean pullDeps;
        private OSPolicyResourceFileResponse source;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceDebResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pullDeps = defaults.pullDeps;
    	      this.source = defaults.source;
        }

        public Builder pullDeps(Boolean pullDeps) {
            this.pullDeps = Objects.requireNonNull(pullDeps);
            return this;
        }
        public Builder source(OSPolicyResourceFileResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }        public OSPolicyResourcePackageResourceDebResponse build() {
            return new OSPolicyResourcePackageResourceDebResponse(pullDeps, source);
        }
    }
}
