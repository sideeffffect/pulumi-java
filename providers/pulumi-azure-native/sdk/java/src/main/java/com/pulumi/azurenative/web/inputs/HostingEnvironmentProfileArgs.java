// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specification for an App Service Environment to use for this resource.
 * 
 */
public final class HostingEnvironmentProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostingEnvironmentProfileArgs Empty = new HostingEnvironmentProfileArgs();

    /**
     * Resource ID of the App Service Environment.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private HostingEnvironmentProfileArgs() {}

    private HostingEnvironmentProfileArgs(HostingEnvironmentProfileArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostingEnvironmentProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostingEnvironmentProfileArgs $;

        public Builder() {
            $ = new HostingEnvironmentProfileArgs();
        }

        public Builder(HostingEnvironmentProfileArgs defaults) {
            $ = new HostingEnvironmentProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public HostingEnvironmentProfileArgs build() {
            return $;
        }
    }

}
