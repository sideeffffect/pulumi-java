// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BrokerLdapServerMetadataGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BrokerLdapServerMetadataGetArgs Empty = new BrokerLdapServerMetadataGetArgs();

    /**
     * List of a fully qualified domain name of the LDAP server and an optional failover server.
     * 
     */
    @InputImport(name="hosts")
      private final @Nullable Input<List<String>> hosts;

    public Input<List<String>> getHosts() {
        return this.hosts == null ? Input.empty() : this.hosts;
    }

    /**
     * Fully qualified name of the directory to search for a user’s groups.
     * 
     */
    @InputImport(name="roleBase")
      private final @Nullable Input<String> roleBase;

    public Input<String> getRoleBase() {
        return this.roleBase == null ? Input.empty() : this.roleBase;
    }

    /**
     * Specifies the LDAP attribute that identifies the group name attribute in the object returned from the group membership query.
     * 
     */
    @InputImport(name="roleName")
      private final @Nullable Input<String> roleName;

    public Input<String> getRoleName() {
        return this.roleName == null ? Input.empty() : this.roleName;
    }

    /**
     * Search criteria for groups.
     * 
     */
    @InputImport(name="roleSearchMatching")
      private final @Nullable Input<String> roleSearchMatching;

    public Input<String> getRoleSearchMatching() {
        return this.roleSearchMatching == null ? Input.empty() : this.roleSearchMatching;
    }

    /**
     * Whether the directory search scope is the entire sub-tree.
     * 
     */
    @InputImport(name="roleSearchSubtree")
      private final @Nullable Input<Boolean> roleSearchSubtree;

    public Input<Boolean> getRoleSearchSubtree() {
        return this.roleSearchSubtree == null ? Input.empty() : this.roleSearchSubtree;
    }

    /**
     * Service account password.
     * 
     */
    @InputImport(name="serviceAccountPassword")
      private final @Nullable Input<String> serviceAccountPassword;

    public Input<String> getServiceAccountPassword() {
        return this.serviceAccountPassword == null ? Input.empty() : this.serviceAccountPassword;
    }

    /**
     * Service account username.
     * 
     */
    @InputImport(name="serviceAccountUsername")
      private final @Nullable Input<String> serviceAccountUsername;

    public Input<String> getServiceAccountUsername() {
        return this.serviceAccountUsername == null ? Input.empty() : this.serviceAccountUsername;
    }

    /**
     * Fully qualified name of the directory where you want to search for users.
     * 
     */
    @InputImport(name="userBase")
      private final @Nullable Input<String> userBase;

    public Input<String> getUserBase() {
        return this.userBase == null ? Input.empty() : this.userBase;
    }

    /**
     * Specifies the name of the LDAP attribute for the user group membership.
     * 
     */
    @InputImport(name="userRoleName")
      private final @Nullable Input<String> userRoleName;

    public Input<String> getUserRoleName() {
        return this.userRoleName == null ? Input.empty() : this.userRoleName;
    }

    /**
     * Search criteria for users.
     * 
     */
    @InputImport(name="userSearchMatching")
      private final @Nullable Input<String> userSearchMatching;

    public Input<String> getUserSearchMatching() {
        return this.userSearchMatching == null ? Input.empty() : this.userSearchMatching;
    }

    /**
     * Whether the directory search scope is the entire sub-tree.
     * 
     */
    @InputImport(name="userSearchSubtree")
      private final @Nullable Input<Boolean> userSearchSubtree;

    public Input<Boolean> getUserSearchSubtree() {
        return this.userSearchSubtree == null ? Input.empty() : this.userSearchSubtree;
    }

    public BrokerLdapServerMetadataGetArgs(
        @Nullable Input<List<String>> hosts,
        @Nullable Input<String> roleBase,
        @Nullable Input<String> roleName,
        @Nullable Input<String> roleSearchMatching,
        @Nullable Input<Boolean> roleSearchSubtree,
        @Nullable Input<String> serviceAccountPassword,
        @Nullable Input<String> serviceAccountUsername,
        @Nullable Input<String> userBase,
        @Nullable Input<String> userRoleName,
        @Nullable Input<String> userSearchMatching,
        @Nullable Input<Boolean> userSearchSubtree) {
        this.hosts = hosts;
        this.roleBase = roleBase;
        this.roleName = roleName;
        this.roleSearchMatching = roleSearchMatching;
        this.roleSearchSubtree = roleSearchSubtree;
        this.serviceAccountPassword = serviceAccountPassword;
        this.serviceAccountUsername = serviceAccountUsername;
        this.userBase = userBase;
        this.userRoleName = userRoleName;
        this.userSearchMatching = userSearchMatching;
        this.userSearchSubtree = userSearchSubtree;
    }

    private BrokerLdapServerMetadataGetArgs() {
        this.hosts = Input.empty();
        this.roleBase = Input.empty();
        this.roleName = Input.empty();
        this.roleSearchMatching = Input.empty();
        this.roleSearchSubtree = Input.empty();
        this.serviceAccountPassword = Input.empty();
        this.serviceAccountUsername = Input.empty();
        this.userBase = Input.empty();
        this.userRoleName = Input.empty();
        this.userSearchMatching = Input.empty();
        this.userSearchSubtree = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrokerLdapServerMetadataGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> hosts;
        private @Nullable Input<String> roleBase;
        private @Nullable Input<String> roleName;
        private @Nullable Input<String> roleSearchMatching;
        private @Nullable Input<Boolean> roleSearchSubtree;
        private @Nullable Input<String> serviceAccountPassword;
        private @Nullable Input<String> serviceAccountUsername;
        private @Nullable Input<String> userBase;
        private @Nullable Input<String> userRoleName;
        private @Nullable Input<String> userSearchMatching;
        private @Nullable Input<Boolean> userSearchSubtree;

        public Builder() {
    	      // Empty
        }

        public Builder(BrokerLdapServerMetadataGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hosts = defaults.hosts;
    	      this.roleBase = defaults.roleBase;
    	      this.roleName = defaults.roleName;
    	      this.roleSearchMatching = defaults.roleSearchMatching;
    	      this.roleSearchSubtree = defaults.roleSearchSubtree;
    	      this.serviceAccountPassword = defaults.serviceAccountPassword;
    	      this.serviceAccountUsername = defaults.serviceAccountUsername;
    	      this.userBase = defaults.userBase;
    	      this.userRoleName = defaults.userRoleName;
    	      this.userSearchMatching = defaults.userSearchMatching;
    	      this.userSearchSubtree = defaults.userSearchSubtree;
        }

        public Builder hosts(@Nullable Input<List<String>> hosts) {
            this.hosts = hosts;
            return this;
        }

        public Builder hosts(@Nullable List<String> hosts) {
            this.hosts = Input.ofNullable(hosts);
            return this;
        }

        public Builder roleBase(@Nullable Input<String> roleBase) {
            this.roleBase = roleBase;
            return this;
        }

        public Builder roleBase(@Nullable String roleBase) {
            this.roleBase = Input.ofNullable(roleBase);
            return this;
        }

        public Builder roleName(@Nullable Input<String> roleName) {
            this.roleName = roleName;
            return this;
        }

        public Builder roleName(@Nullable String roleName) {
            this.roleName = Input.ofNullable(roleName);
            return this;
        }

        public Builder roleSearchMatching(@Nullable Input<String> roleSearchMatching) {
            this.roleSearchMatching = roleSearchMatching;
            return this;
        }

        public Builder roleSearchMatching(@Nullable String roleSearchMatching) {
            this.roleSearchMatching = Input.ofNullable(roleSearchMatching);
            return this;
        }

        public Builder roleSearchSubtree(@Nullable Input<Boolean> roleSearchSubtree) {
            this.roleSearchSubtree = roleSearchSubtree;
            return this;
        }

        public Builder roleSearchSubtree(@Nullable Boolean roleSearchSubtree) {
            this.roleSearchSubtree = Input.ofNullable(roleSearchSubtree);
            return this;
        }

        public Builder serviceAccountPassword(@Nullable Input<String> serviceAccountPassword) {
            this.serviceAccountPassword = serviceAccountPassword;
            return this;
        }

        public Builder serviceAccountPassword(@Nullable String serviceAccountPassword) {
            this.serviceAccountPassword = Input.ofNullable(serviceAccountPassword);
            return this;
        }

        public Builder serviceAccountUsername(@Nullable Input<String> serviceAccountUsername) {
            this.serviceAccountUsername = serviceAccountUsername;
            return this;
        }

        public Builder serviceAccountUsername(@Nullable String serviceAccountUsername) {
            this.serviceAccountUsername = Input.ofNullable(serviceAccountUsername);
            return this;
        }

        public Builder userBase(@Nullable Input<String> userBase) {
            this.userBase = userBase;
            return this;
        }

        public Builder userBase(@Nullable String userBase) {
            this.userBase = Input.ofNullable(userBase);
            return this;
        }

        public Builder userRoleName(@Nullable Input<String> userRoleName) {
            this.userRoleName = userRoleName;
            return this;
        }

        public Builder userRoleName(@Nullable String userRoleName) {
            this.userRoleName = Input.ofNullable(userRoleName);
            return this;
        }

        public Builder userSearchMatching(@Nullable Input<String> userSearchMatching) {
            this.userSearchMatching = userSearchMatching;
            return this;
        }

        public Builder userSearchMatching(@Nullable String userSearchMatching) {
            this.userSearchMatching = Input.ofNullable(userSearchMatching);
            return this;
        }

        public Builder userSearchSubtree(@Nullable Input<Boolean> userSearchSubtree) {
            this.userSearchSubtree = userSearchSubtree;
            return this;
        }

        public Builder userSearchSubtree(@Nullable Boolean userSearchSubtree) {
            this.userSearchSubtree = Input.ofNullable(userSearchSubtree);
            return this;
        }
        public BrokerLdapServerMetadataGetArgs build() {
            return new BrokerLdapServerMetadataGetArgs(hosts, roleBase, roleName, roleSearchMatching, roleSearchSubtree, serviceAccountPassword, serviceAccountUsername, userBase, userRoleName, userSearchMatching, userSearchSubtree);
        }
    }
}
