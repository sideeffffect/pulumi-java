// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.rds.inputs;

import com.pulumi.awsnative.rds.enums.DBProxyAuthFormatAuthScheme;
import com.pulumi.awsnative.rds.enums.DBProxyAuthFormatIAMAuth;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DBProxyAuthFormat extends com.pulumi.resources.InvokeArgs {

    public static final DBProxyAuthFormat Empty = new DBProxyAuthFormat();

    /**
     * The type of authentication that the proxy uses for connections from the proxy to the underlying database.
     * 
     */
    @Import(name="authScheme")
    private @Nullable DBProxyAuthFormatAuthScheme authScheme;

    public Optional<DBProxyAuthFormatAuthScheme> authScheme() {
        return Optional.ofNullable(this.authScheme);
    }

    /**
     * A user-specified description about the authentication used by a proxy to log in as a specific database user.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the proxy.
     * 
     */
    @Import(name="iAMAuth")
    private @Nullable DBProxyAuthFormatIAMAuth iAMAuth;

    public Optional<DBProxyAuthFormatIAMAuth> iAMAuth() {
        return Optional.ofNullable(this.iAMAuth);
    }

    /**
     * The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
     * 
     */
    @Import(name="secretArn")
    private @Nullable String secretArn;

    public Optional<String> secretArn() {
        return Optional.ofNullable(this.secretArn);
    }

    /**
     * The name of the database user to which the proxy connects.
     * 
     */
    @Import(name="userName")
    private @Nullable String userName;

    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }

    private DBProxyAuthFormat() {}

    private DBProxyAuthFormat(DBProxyAuthFormat $) {
        this.authScheme = $.authScheme;
        this.description = $.description;
        this.iAMAuth = $.iAMAuth;
        this.secretArn = $.secretArn;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DBProxyAuthFormat defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DBProxyAuthFormat $;

        public Builder() {
            $ = new DBProxyAuthFormat();
        }

        public Builder(DBProxyAuthFormat defaults) {
            $ = new DBProxyAuthFormat(Objects.requireNonNull(defaults));
        }

        public Builder authScheme(@Nullable DBProxyAuthFormatAuthScheme authScheme) {
            $.authScheme = authScheme;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder iAMAuth(@Nullable DBProxyAuthFormatIAMAuth iAMAuth) {
            $.iAMAuth = iAMAuth;
            return this;
        }

        public Builder secretArn(@Nullable String secretArn) {
            $.secretArn = secretArn;
            return this;
        }

        public Builder userName(@Nullable String userName) {
            $.userName = userName;
            return this;
        }

        public DBProxyAuthFormat build() {
            return $;
        }
    }

}
