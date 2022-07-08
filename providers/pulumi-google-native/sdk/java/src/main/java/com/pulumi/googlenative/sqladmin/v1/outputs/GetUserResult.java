// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.sqladmin.v1.outputs.SqlServerUserDetailsResponse;
import com.pulumi.googlenative.sqladmin.v1.outputs.UserPasswordValidationPolicyResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUserResult {
    /**
     * @return Dual password status for the user.
     * 
     */
    private final String dualPasswordType;
    /**
     * @return This field is deprecated and will be removed from a future version of the API.
     * 
     * @deprecated
     * This field is deprecated and will be removed from a future version of the API.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed from a future version of the API. */
    private final String etag;
    /**
     * @return Optional. The host from which the user can connect. For `insert` operations, host defaults to an empty string. For `update` operations, host is specified as part of the request URL. The host name cannot be updated after insertion. For a MySQL instance, it&#39;s required; for a PostgreSQL or SQL Server instance, it&#39;s optional.
     * 
     */
    private final String host;
    /**
     * @return The name of the Cloud SQL instance. This does not include the project ID. Can be omitted for `update` because it is already specified on the URL.
     * 
     */
    private final String instance;
    /**
     * @return This is always `sql#user`.
     * 
     */
    private final String kind;
    /**
     * @return The name of the user in the Cloud SQL instance. Can be omitted for `update` because it is already specified in the URL.
     * 
     */
    private final String name;
    /**
     * @return The password for the user.
     * 
     */
    private final String password;
    /**
     * @return User level password validation policy.
     * 
     */
    private final UserPasswordValidationPolicyResponse passwordPolicy;
    /**
     * @return The project ID of the project containing the Cloud SQL database. The Google apps domain is prefixed if applicable. Can be omitted for `update` because it is already specified on the URL.
     * 
     */
    private final String project;
    private final SqlServerUserDetailsResponse sqlserverUserDetails;
    /**
     * @return The user type. It determines the method to authenticate the user during login. The default is the database&#39;s built-in user type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetUserResult(
        @CustomType.Parameter("dualPasswordType") String dualPasswordType,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("instance") String instance,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("passwordPolicy") UserPasswordValidationPolicyResponse passwordPolicy,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("sqlserverUserDetails") SqlServerUserDetailsResponse sqlserverUserDetails,
        @CustomType.Parameter("type") String type) {
        this.dualPasswordType = dualPasswordType;
        this.etag = etag;
        this.host = host;
        this.instance = instance;
        this.kind = kind;
        this.name = name;
        this.password = password;
        this.passwordPolicy = passwordPolicy;
        this.project = project;
        this.sqlserverUserDetails = sqlserverUserDetails;
        this.type = type;
    }

    /**
     * @return Dual password status for the user.
     * 
     */
    public String dualPasswordType() {
        return this.dualPasswordType;
    }
    /**
     * @return This field is deprecated and will be removed from a future version of the API.
     * 
     * @deprecated
     * This field is deprecated and will be removed from a future version of the API.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed from a future version of the API. */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Optional. The host from which the user can connect. For `insert` operations, host defaults to an empty string. For `update` operations, host is specified as part of the request URL. The host name cannot be updated after insertion. For a MySQL instance, it&#39;s required; for a PostgreSQL or SQL Server instance, it&#39;s optional.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return The name of the Cloud SQL instance. This does not include the project ID. Can be omitted for `update` because it is already specified on the URL.
     * 
     */
    public String instance() {
        return this.instance;
    }
    /**
     * @return This is always `sql#user`.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The name of the user in the Cloud SQL instance. Can be omitted for `update` because it is already specified in the URL.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The password for the user.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return User level password validation policy.
     * 
     */
    public UserPasswordValidationPolicyResponse passwordPolicy() {
        return this.passwordPolicy;
    }
    /**
     * @return The project ID of the project containing the Cloud SQL database. The Google apps domain is prefixed if applicable. Can be omitted for `update` because it is already specified on the URL.
     * 
     */
    public String project() {
        return this.project;
    }
    public SqlServerUserDetailsResponse sqlserverUserDetails() {
        return this.sqlserverUserDetails;
    }
    /**
     * @return The user type. It determines the method to authenticate the user during login. The default is the database&#39;s built-in user type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dualPasswordType;
        private String etag;
        private String host;
        private String instance;
        private String kind;
        private String name;
        private String password;
        private UserPasswordValidationPolicyResponse passwordPolicy;
        private String project;
        private SqlServerUserDetailsResponse sqlserverUserDetails;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dualPasswordType = defaults.dualPasswordType;
    	      this.etag = defaults.etag;
    	      this.host = defaults.host;
    	      this.instance = defaults.instance;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.passwordPolicy = defaults.passwordPolicy;
    	      this.project = defaults.project;
    	      this.sqlserverUserDetails = defaults.sqlserverUserDetails;
    	      this.type = defaults.type;
        }

        public Builder dualPasswordType(String dualPasswordType) {
            this.dualPasswordType = Objects.requireNonNull(dualPasswordType);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder instance(String instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder passwordPolicy(UserPasswordValidationPolicyResponse passwordPolicy) {
            this.passwordPolicy = Objects.requireNonNull(passwordPolicy);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder sqlserverUserDetails(SqlServerUserDetailsResponse sqlserverUserDetails) {
            this.sqlserverUserDetails = Objects.requireNonNull(sqlserverUserDetails);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetUserResult build() {
            return new GetUserResult(dualPasswordType, etag, host, instance, kind, name, password, passwordPolicy, project, sqlserverUserDetails, type);
        }
    }
}
