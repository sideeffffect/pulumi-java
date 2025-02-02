// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurearcdata;

import com.pulumi.azurenative.azurearcdata.inputs.DataControllerPropertiesArgs;
import com.pulumi.azurenative.azurearcdata.inputs.ExtendedLocationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataControllerArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataControllerArgs Empty = new DataControllerArgs();

    @Import(name="dataControllerName")
    private @Nullable Output<String> dataControllerName;

    public Optional<Output<String>> dataControllerName() {
        return Optional.ofNullable(this.dataControllerName);
    }

    /**
     * The extendedLocation of the resource.
     * 
     */
    @Import(name="extendedLocation")
    private @Nullable Output<ExtendedLocationArgs> extendedLocation;

    /**
     * @return The extendedLocation of the resource.
     * 
     */
    public Optional<Output<ExtendedLocationArgs>> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The data controller&#39;s properties
     * 
     */
    @Import(name="properties", required=true)
    private Output<DataControllerPropertiesArgs> properties;

    /**
     * @return The data controller&#39;s properties
     * 
     */
    public Output<DataControllerPropertiesArgs> properties() {
        return this.properties;
    }

    /**
     * The name of the Azure resource group
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Azure resource group
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DataControllerArgs() {}

    private DataControllerArgs(DataControllerArgs $) {
        this.dataControllerName = $.dataControllerName;
        this.extendedLocation = $.extendedLocation;
        this.location = $.location;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataControllerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataControllerArgs $;

        public Builder() {
            $ = new DataControllerArgs();
        }

        public Builder(DataControllerArgs defaults) {
            $ = new DataControllerArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataControllerName(@Nullable Output<String> dataControllerName) {
            $.dataControllerName = dataControllerName;
            return this;
        }

        public Builder dataControllerName(String dataControllerName) {
            return dataControllerName(Output.of(dataControllerName));
        }

        /**
         * @param extendedLocation The extendedLocation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            $.extendedLocation = extendedLocation;
            return this;
        }

        /**
         * @param extendedLocation The extendedLocation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder extendedLocation(ExtendedLocationArgs extendedLocation) {
            return extendedLocation(Output.of(extendedLocation));
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param properties The data controller&#39;s properties
         * 
         * @return builder
         * 
         */
        public Builder properties(Output<DataControllerPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The data controller&#39;s properties
         * 
         * @return builder
         * 
         */
        public Builder properties(DataControllerPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The name of the Azure resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Azure resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public DataControllerArgs build() {
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
