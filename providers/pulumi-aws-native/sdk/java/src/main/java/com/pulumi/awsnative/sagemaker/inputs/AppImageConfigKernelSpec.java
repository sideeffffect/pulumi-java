// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppImageConfigKernelSpec extends com.pulumi.resources.InvokeArgs {

    public static final AppImageConfigKernelSpec Empty = new AppImageConfigKernelSpec();

    /**
     * The display name of the kernel.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The name of the kernel.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private AppImageConfigKernelSpec() {}

    private AppImageConfigKernelSpec(AppImageConfigKernelSpec $) {
        this.displayName = $.displayName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppImageConfigKernelSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppImageConfigKernelSpec $;

        public Builder() {
            $ = new AppImageConfigKernelSpec();
        }

        public Builder(AppImageConfigKernelSpec defaults) {
            $ = new AppImageConfigKernelSpec(Objects.requireNonNull(defaults));
        }

        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public AppImageConfigKernelSpec build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
