// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserState extends io.pulumi.resources.ResourceArgs {

    public static final UserState Empty = new UserState();

    /**
     * The deletion policy for the user.
     * Setting `ABANDON` allows the resource to be abandoned rather than deleted. This is useful
     * for Postgres, where users cannot be deleted from the API if they have been granted SQL roles.
     * 
     */
    @InputImport(name="deletionPolicy")
      private final @Nullable Input<String> deletionPolicy;

    public Input<String> getDeletionPolicy() {
        return this.deletionPolicy == null ? Input.empty() : this.deletionPolicy;
    }

    /**
     * The host the user can connect from. This is only supported
     * for MySQL instances. Don't set this field for PostgreSQL instances.
     * Can be an IP address. Changing this forces a new resource to be created.
     * 
     */
    @InputImport(name="host")
      private final @Nullable Input<String> host;

    public Input<String> getHost() {
        return this.host == null ? Input.empty() : this.host;
    }

    /**
     * The name of the Cloud SQL instance. Changing this
     * forces a new resource to be created.
     * 
     */
    @InputImport(name="instance")
      private final @Nullable Input<String> instance;

    public Input<String> getInstance() {
        return this.instance == null ? Input.empty() : this.instance;
    }

    /**
     * The name of the user. Changing this forces a new resource
     * to be created.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The password for the user. Can be updated. For Postgres
     * instances this is a Required field.
     * 
     */
    @InputImport(name="password")
      private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The user type. It determines the method to authenticate the
     * user during login. The default is the database's built-in user type. Flags
     * include "BUILT_IN", "CLOUD_IAM_USER", or "CLOUD_IAM_SERVICE_ACCOUNT".
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public UserState(
        @Nullable Input<String> deletionPolicy,
        @Nullable Input<String> host,
        @Nullable Input<String> instance,
        @Nullable Input<String> name,
        @Nullable Input<String> password,
        @Nullable Input<String> project,
        @Nullable Input<String> type) {
        this.deletionPolicy = deletionPolicy;
        this.host = host;
        this.instance = instance;
        this.name = name;
        this.password = password;
        this.project = project;
        this.type = type;
    }

    private UserState() {
        this.deletionPolicy = Input.empty();
        this.host = Input.empty();
        this.instance = Input.empty();
        this.name = Input.empty();
        this.password = Input.empty();
        this.project = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deletionPolicy;
        private @Nullable Input<String> host;
        private @Nullable Input<String> instance;
        private @Nullable Input<String> name;
        private @Nullable Input<String> password;
        private @Nullable Input<String> project;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(UserState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deletionPolicy = defaults.deletionPolicy;
    	      this.host = defaults.host;
    	      this.instance = defaults.instance;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.project = defaults.project;
    	      this.type = defaults.type;
        }

        public Builder deletionPolicy(@Nullable Input<String> deletionPolicy) {
            this.deletionPolicy = deletionPolicy;
            return this;
        }

        public Builder deletionPolicy(@Nullable String deletionPolicy) {
            this.deletionPolicy = Input.ofNullable(deletionPolicy);
            return this;
        }

        public Builder host(@Nullable Input<String> host) {
            this.host = host;
            return this;
        }

        public Builder host(@Nullable String host) {
            this.host = Input.ofNullable(host);
            return this;
        }

        public Builder instance(@Nullable Input<String> instance) {
            this.instance = instance;
            return this;
        }

        public Builder instance(@Nullable String instance) {
            this.instance = Input.ofNullable(instance);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder password(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public UserState build() {
            return new UserState(deletionPolicy, host, instance, name, password, project, type);
        }
    }
}
