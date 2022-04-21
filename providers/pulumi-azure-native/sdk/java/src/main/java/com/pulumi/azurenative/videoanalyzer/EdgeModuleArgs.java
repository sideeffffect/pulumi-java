// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeModuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdgeModuleArgs Empty = new EdgeModuleArgs();

    /**
     * The Azure Video Analyzer account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The name of the edge module to create or update.
     * 
     */
    @Import(name="edgeModuleName")
    private @Nullable Output<String> edgeModuleName;

    public Optional<Output<String>> edgeModuleName() {
        return Optional.ofNullable(this.edgeModuleName);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private EdgeModuleArgs() {}

    private EdgeModuleArgs(EdgeModuleArgs $) {
        this.accountName = $.accountName;
        this.edgeModuleName = $.edgeModuleName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeModuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeModuleArgs $;

        public Builder() {
            $ = new EdgeModuleArgs();
        }

        public Builder(EdgeModuleArgs defaults) {
            $ = new EdgeModuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        public Builder edgeModuleName(@Nullable Output<String> edgeModuleName) {
            $.edgeModuleName = edgeModuleName;
            return this;
        }

        public Builder edgeModuleName(String edgeModuleName) {
            return edgeModuleName(Output.of(edgeModuleName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public EdgeModuleArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
