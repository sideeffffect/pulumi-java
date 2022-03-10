// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A package managed by GooGet. - install: `googet -noconfirm install package` - remove: `googet -noconfirm remove package`
 * 
 */
public final class OSPolicyResourcePackageResourceGooGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourcePackageResourceGooGetArgs Empty = new OSPolicyResourcePackageResourceGooGetArgs();

    /**
     * Package name.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public OSPolicyResourcePackageResourceGooGetArgs(Input<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private OSPolicyResourcePackageResourceGooGetArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceGooGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceGooGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public OSPolicyResourcePackageResourceGooGetArgs build() {
            return new OSPolicyResourcePackageResourceGooGetArgs(name);
        }
    }
}
