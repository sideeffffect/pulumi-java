// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A package managed by GooGet. - install: `googet -noconfirm install package` - remove: `googet -noconfirm remove package`
 * 
 */
public final class OSPolicyResourcePackageResourceGooGetResponse extends com.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourcePackageResourceGooGetResponse Empty = new OSPolicyResourcePackageResourceGooGetResponse();

    /**
     * Package name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private OSPolicyResourcePackageResourceGooGetResponse() {}

    private OSPolicyResourcePackageResourceGooGetResponse(OSPolicyResourcePackageResourceGooGetResponse $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourcePackageResourceGooGetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourcePackageResourceGooGetResponse $;

        public Builder() {
            $ = new OSPolicyResourcePackageResourceGooGetResponse();
        }

        public Builder(OSPolicyResourcePackageResourceGooGetResponse defaults) {
            $ = new OSPolicyResourcePackageResourceGooGetResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public OSPolicyResourcePackageResourceGooGetResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
