// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.maps.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountPlainArgs Empty = new GetAccountPlainArgs();

    /**
     * Specifies the name of the Maps Account.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Specifies the name of the Maps Account.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Specifies the name of the Resource Group in which the Maps Account is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group in which the Maps Account is located.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetAccountPlainArgs() {}

    private GetAccountPlainArgs(GetAccountPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountPlainArgs $;

        public Builder() {
            $ = new GetAccountPlainArgs();
        }

        public Builder(GetAccountPlainArgs defaults) {
            $ = new GetAccountPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Maps Account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group in which the Maps Account is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetAccountPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
