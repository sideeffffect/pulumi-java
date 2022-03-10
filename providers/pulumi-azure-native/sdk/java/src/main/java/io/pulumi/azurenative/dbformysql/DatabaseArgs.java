// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseArgs Empty = new DatabaseArgs();

    /**
     * The charset of the database.
     * 
     */
    @InputImport(name="charset")
      private final @Nullable Input<String> charset;

    public Input<String> getCharset() {
        return this.charset == null ? Input.empty() : this.charset;
    }

    /**
     * The collation of the database.
     * 
     */
    @InputImport(name="collation")
      private final @Nullable Input<String> collation;

    public Input<String> getCollation() {
        return this.collation == null ? Input.empty() : this.collation;
    }

    /**
     * The name of the database.
     * 
     */
    @InputImport(name="databaseName")
      private final @Nullable Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName == null ? Input.empty() : this.databaseName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @InputImport(name="serverName", required=true)
      private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    public DatabaseArgs(
        @Nullable Input<String> charset,
        @Nullable Input<String> collation,
        @Nullable Input<String> databaseName,
        Input<String> resourceGroupName,
        Input<String> serverName) {
        this.charset = charset;
        this.collation = collation;
        this.databaseName = databaseName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private DatabaseArgs() {
        this.charset = Input.empty();
        this.collation = Input.empty();
        this.databaseName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> charset;
        private @Nullable Input<String> collation;
        private @Nullable Input<String> databaseName;
        private Input<String> resourceGroupName;
        private Input<String> serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.charset = defaults.charset;
    	      this.collation = defaults.collation;
    	      this.databaseName = defaults.databaseName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
        }

        public Builder charset(@Nullable Input<String> charset) {
            this.charset = charset;
            return this;
        }

        public Builder charset(@Nullable String charset) {
            this.charset = Input.ofNullable(charset);
            return this;
        }

        public Builder collation(@Nullable Input<String> collation) {
            this.collation = collation;
            return this;
        }

        public Builder collation(@Nullable String collation) {
            this.collation = Input.ofNullable(collation);
            return this;
        }

        public Builder databaseName(@Nullable Input<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = Input.ofNullable(databaseName);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder serverName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder serverName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }
        public DatabaseArgs build() {
            return new DatabaseArgs(charset, collation, databaseName, resourceGroupName, serverName);
        }
    }
}
