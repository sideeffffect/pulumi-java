// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights;

import com.pulumi.azurenative.customerinsights.enums.ConnectorTypes;
import com.pulumi.azurenative.customerinsights.enums.EntityTypes;
import com.pulumi.azurenative.customerinsights.inputs.ConnectorMappingPropertiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorMappingArgs Empty = new ConnectorMappingArgs();

    /**
     * The name of the connector.
     * 
     */
    @Import(name="connectorName", required=true)
    private Output<String> connectorName;

    /**
     * @return The name of the connector.
     * 
     */
    public Output<String> connectorName() {
        return this.connectorName;
    }

    /**
     * Type of connector.
     * 
     */
    @Import(name="connectorType")
    private @Nullable Output<Either<String,ConnectorTypes>> connectorType;

    /**
     * @return Type of connector.
     * 
     */
    public Optional<Output<Either<String,ConnectorTypes>>> connectorType() {
        return Optional.ofNullable(this.connectorType);
    }

    /**
     * The description of the connector mapping.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the connector mapping.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Display name for the connector mapping.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Display name for the connector mapping.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Defines which entity type the file should map to.
     * 
     */
    @Import(name="entityType", required=true)
    private Output<EntityTypes> entityType;

    /**
     * @return Defines which entity type the file should map to.
     * 
     */
    public Output<EntityTypes> entityType() {
        return this.entityType;
    }

    /**
     * The mapping entity name.
     * 
     */
    @Import(name="entityTypeName", required=true)
    private Output<String> entityTypeName;

    /**
     * @return The mapping entity name.
     * 
     */
    public Output<String> entityTypeName() {
        return this.entityTypeName;
    }

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
    private Output<String> hubName;

    /**
     * @return The name of the hub.
     * 
     */
    public Output<String> hubName() {
        return this.hubName;
    }

    /**
     * The name of the connector mapping.
     * 
     */
    @Import(name="mappingName")
    private @Nullable Output<String> mappingName;

    /**
     * @return The name of the connector mapping.
     * 
     */
    public Optional<Output<String>> mappingName() {
        return Optional.ofNullable(this.mappingName);
    }

    /**
     * The properties of the mapping.
     * 
     */
    @Import(name="mappingProperties", required=true)
    private Output<ConnectorMappingPropertiesArgs> mappingProperties;

    /**
     * @return The properties of the mapping.
     * 
     */
    public Output<ConnectorMappingPropertiesArgs> mappingProperties() {
        return this.mappingProperties;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ConnectorMappingArgs() {}

    private ConnectorMappingArgs(ConnectorMappingArgs $) {
        this.connectorName = $.connectorName;
        this.connectorType = $.connectorType;
        this.description = $.description;
        this.displayName = $.displayName;
        this.entityType = $.entityType;
        this.entityTypeName = $.entityTypeName;
        this.hubName = $.hubName;
        this.mappingName = $.mappingName;
        this.mappingProperties = $.mappingProperties;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorMappingArgs $;

        public Builder() {
            $ = new ConnectorMappingArgs();
        }

        public Builder(ConnectorMappingArgs defaults) {
            $ = new ConnectorMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectorName The name of the connector.
         * 
         * @return builder
         * 
         */
        public Builder connectorName(Output<String> connectorName) {
            $.connectorName = connectorName;
            return this;
        }

        /**
         * @param connectorName The name of the connector.
         * 
         * @return builder
         * 
         */
        public Builder connectorName(String connectorName) {
            return connectorName(Output.of(connectorName));
        }

        /**
         * @param connectorType Type of connector.
         * 
         * @return builder
         * 
         */
        public Builder connectorType(@Nullable Output<Either<String,ConnectorTypes>> connectorType) {
            $.connectorType = connectorType;
            return this;
        }

        /**
         * @param connectorType Type of connector.
         * 
         * @return builder
         * 
         */
        public Builder connectorType(Either<String,ConnectorTypes> connectorType) {
            return connectorType(Output.of(connectorType));
        }

        /**
         * @param connectorType Type of connector.
         * 
         * @return builder
         * 
         */
        public Builder connectorType(String connectorType) {
            return connectorType(Either.ofLeft(connectorType));
        }

        /**
         * @param connectorType Type of connector.
         * 
         * @return builder
         * 
         */
        public Builder connectorType(ConnectorTypes connectorType) {
            return connectorType(Either.ofRight(connectorType));
        }

        /**
         * @param description The description of the connector mapping.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the connector mapping.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Display name for the connector mapping.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Display name for the connector mapping.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param entityType Defines which entity type the file should map to.
         * 
         * @return builder
         * 
         */
        public Builder entityType(Output<EntityTypes> entityType) {
            $.entityType = entityType;
            return this;
        }

        /**
         * @param entityType Defines which entity type the file should map to.
         * 
         * @return builder
         * 
         */
        public Builder entityType(EntityTypes entityType) {
            return entityType(Output.of(entityType));
        }

        /**
         * @param entityTypeName The mapping entity name.
         * 
         * @return builder
         * 
         */
        public Builder entityTypeName(Output<String> entityTypeName) {
            $.entityTypeName = entityTypeName;
            return this;
        }

        /**
         * @param entityTypeName The mapping entity name.
         * 
         * @return builder
         * 
         */
        public Builder entityTypeName(String entityTypeName) {
            return entityTypeName(Output.of(entityTypeName));
        }

        /**
         * @param hubName The name of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(Output<String> hubName) {
            $.hubName = hubName;
            return this;
        }

        /**
         * @param hubName The name of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(String hubName) {
            return hubName(Output.of(hubName));
        }

        /**
         * @param mappingName The name of the connector mapping.
         * 
         * @return builder
         * 
         */
        public Builder mappingName(@Nullable Output<String> mappingName) {
            $.mappingName = mappingName;
            return this;
        }

        /**
         * @param mappingName The name of the connector mapping.
         * 
         * @return builder
         * 
         */
        public Builder mappingName(String mappingName) {
            return mappingName(Output.of(mappingName));
        }

        /**
         * @param mappingProperties The properties of the mapping.
         * 
         * @return builder
         * 
         */
        public Builder mappingProperties(Output<ConnectorMappingPropertiesArgs> mappingProperties) {
            $.mappingProperties = mappingProperties;
            return this;
        }

        /**
         * @param mappingProperties The properties of the mapping.
         * 
         * @return builder
         * 
         */
        public Builder mappingProperties(ConnectorMappingPropertiesArgs mappingProperties) {
            return mappingProperties(Output.of(mappingProperties));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ConnectorMappingArgs build() {
            $.connectorName = Objects.requireNonNull($.connectorName, "expected parameter 'connectorName' to be non-null");
            $.entityType = Objects.requireNonNull($.entityType, "expected parameter 'entityType' to be non-null");
            $.entityTypeName = Objects.requireNonNull($.entityTypeName, "expected parameter 'entityTypeName' to be non-null");
            $.hubName = Objects.requireNonNull($.hubName, "expected parameter 'hubName' to be non-null");
            $.mappingProperties = Objects.requireNonNull($.mappingProperties, "expected parameter 'mappingProperties' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
