// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A package managed by YUM. - install: `yum -y install package` - remove: `yum -y remove package`
 * 
 */
public final class OSPolicyResourcePackageResourceYUMArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourcePackageResourceYUMArgs Empty = new OSPolicyResourcePackageResourceYUMArgs();

    /**
     * Package name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Package name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private OSPolicyResourcePackageResourceYUMArgs() {}

    private OSPolicyResourcePackageResourceYUMArgs(OSPolicyResourcePackageResourceYUMArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourcePackageResourceYUMArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourcePackageResourceYUMArgs $;

        public Builder() {
            $ = new OSPolicyResourcePackageResourceYUMArgs();
        }

        public Builder(OSPolicyResourcePackageResourceYUMArgs defaults) {
            $ = new OSPolicyResourcePackageResourceYUMArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Package name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Package name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public OSPolicyResourcePackageResourceYUMArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
