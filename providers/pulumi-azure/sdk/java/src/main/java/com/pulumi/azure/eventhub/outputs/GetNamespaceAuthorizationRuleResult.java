// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNamespaceAuthorizationRuleResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Does this Authorization Rule have permissions to Listen to the Event Hub?
     * 
     */
    private final Boolean listen;
    /**
     * @return Does this Authorization Rule have permissions to Manage to the Event Hub?
     * 
     */
    private final Boolean manage;
    private final String name;
    private final String namespaceName;
    /**
     * @return The Primary Connection String for the Event Hubs authorization Rule.
     * 
     */
    private final String primaryConnectionString;
    /**
     * @return The alias of the Primary Connection String for the Event Hubs authorization Rule.
     * 
     */
    private final String primaryConnectionStringAlias;
    /**
     * @return The Primary Key for the Event Hubs authorization Rule.
     * 
     */
    private final String primaryKey;
    private final String resourceGroupName;
    /**
     * @return The Secondary Connection String for the Event Hubs authorization Rule.
     * 
     */
    private final String secondaryConnectionString;
    /**
     * @return The alias of the Secondary Connection String for the Event Hubs authorization Rule.
     * 
     */
    private final String secondaryConnectionStringAlias;
    /**
     * @return The Secondary Key for the Event Hubs authorization Rule.
     * 
     */
    private final String secondaryKey;
    /**
     * @return Does this Authorization Rule have permissions to Send to the Event Hub?
     * 
     */
    private final Boolean send;

    @CustomType.Constructor
    private GetNamespaceAuthorizationRuleResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("listen") Boolean listen,
        @CustomType.Parameter("manage") Boolean manage,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespaceName") String namespaceName,
        @CustomType.Parameter("primaryConnectionString") String primaryConnectionString,
        @CustomType.Parameter("primaryConnectionStringAlias") String primaryConnectionStringAlias,
        @CustomType.Parameter("primaryKey") String primaryKey,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("secondaryConnectionString") String secondaryConnectionString,
        @CustomType.Parameter("secondaryConnectionStringAlias") String secondaryConnectionStringAlias,
        @CustomType.Parameter("secondaryKey") String secondaryKey,
        @CustomType.Parameter("send") Boolean send) {
        this.id = id;
        this.listen = listen;
        this.manage = manage;
        this.name = name;
        this.namespaceName = namespaceName;
        this.primaryConnectionString = primaryConnectionString;
        this.primaryConnectionStringAlias = primaryConnectionStringAlias;
        this.primaryKey = primaryKey;
        this.resourceGroupName = resourceGroupName;
        this.secondaryConnectionString = secondaryConnectionString;
        this.secondaryConnectionStringAlias = secondaryConnectionStringAlias;
        this.secondaryKey = secondaryKey;
        this.send = send;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Does this Authorization Rule have permissions to Listen to the Event Hub?
     * 
     */
    public Boolean listen() {
        return this.listen;
    }
    /**
     * @return Does this Authorization Rule have permissions to Manage to the Event Hub?
     * 
     */
    public Boolean manage() {
        return this.manage;
    }
    public String name() {
        return this.name;
    }
    public String namespaceName() {
        return this.namespaceName;
    }
    /**
     * @return The Primary Connection String for the Event Hubs authorization Rule.
     * 
     */
    public String primaryConnectionString() {
        return this.primaryConnectionString;
    }
    /**
     * @return The alias of the Primary Connection String for the Event Hubs authorization Rule.
     * 
     */
    public String primaryConnectionStringAlias() {
        return this.primaryConnectionStringAlias;
    }
    /**
     * @return The Primary Key for the Event Hubs authorization Rule.
     * 
     */
    public String primaryKey() {
        return this.primaryKey;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The Secondary Connection String for the Event Hubs authorization Rule.
     * 
     */
    public String secondaryConnectionString() {
        return this.secondaryConnectionString;
    }
    /**
     * @return The alias of the Secondary Connection String for the Event Hubs authorization Rule.
     * 
     */
    public String secondaryConnectionStringAlias() {
        return this.secondaryConnectionStringAlias;
    }
    /**
     * @return The Secondary Key for the Event Hubs authorization Rule.
     * 
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }
    /**
     * @return Does this Authorization Rule have permissions to Send to the Event Hub?
     * 
     */
    public Boolean send() {
        return this.send;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceAuthorizationRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private Boolean listen;
        private Boolean manage;
        private String name;
        private String namespaceName;
        private String primaryConnectionString;
        private String primaryConnectionStringAlias;
        private String primaryKey;
        private String resourceGroupName;
        private String secondaryConnectionString;
        private String secondaryConnectionStringAlias;
        private String secondaryKey;
        private Boolean send;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceAuthorizationRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.listen = defaults.listen;
    	      this.manage = defaults.manage;
    	      this.name = defaults.name;
    	      this.namespaceName = defaults.namespaceName;
    	      this.primaryConnectionString = defaults.primaryConnectionString;
    	      this.primaryConnectionStringAlias = defaults.primaryConnectionStringAlias;
    	      this.primaryKey = defaults.primaryKey;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secondaryConnectionString = defaults.secondaryConnectionString;
    	      this.secondaryConnectionStringAlias = defaults.secondaryConnectionStringAlias;
    	      this.secondaryKey = defaults.secondaryKey;
    	      this.send = defaults.send;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder listen(Boolean listen) {
            this.listen = Objects.requireNonNull(listen);
            return this;
        }
        public Builder manage(Boolean manage) {
            this.manage = Objects.requireNonNull(manage);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        public Builder primaryConnectionString(String primaryConnectionString) {
            this.primaryConnectionString = Objects.requireNonNull(primaryConnectionString);
            return this;
        }
        public Builder primaryConnectionStringAlias(String primaryConnectionStringAlias) {
            this.primaryConnectionStringAlias = Objects.requireNonNull(primaryConnectionStringAlias);
            return this;
        }
        public Builder primaryKey(String primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder secondaryConnectionString(String secondaryConnectionString) {
            this.secondaryConnectionString = Objects.requireNonNull(secondaryConnectionString);
            return this;
        }
        public Builder secondaryConnectionStringAlias(String secondaryConnectionStringAlias) {
            this.secondaryConnectionStringAlias = Objects.requireNonNull(secondaryConnectionStringAlias);
            return this;
        }
        public Builder secondaryKey(String secondaryKey) {
            this.secondaryKey = Objects.requireNonNull(secondaryKey);
            return this;
        }
        public Builder send(Boolean send) {
            this.send = Objects.requireNonNull(send);
            return this;
        }        public GetNamespaceAuthorizationRuleResult build() {
            return new GetNamespaceAuthorizationRuleResult(id, listen, manage, name, namespaceName, primaryConnectionString, primaryConnectionStringAlias, primaryKey, resourceGroupName, secondaryConnectionString, secondaryConnectionStringAlias, secondaryKey, send);
        }
    }
}
