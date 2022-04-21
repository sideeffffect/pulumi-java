// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties required to create a connection to Azure SQL database Managed instance
 * 
 */
public final class MiSqlConnectionInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final MiSqlConnectionInfoArgs Empty = new MiSqlConnectionInfoArgs();

    /**
     * Resource id for Azure SQL database Managed instance
     * 
     */
    @Import(name="managedInstanceResourceId", required=true)
    private Output<String> managedInstanceResourceId;

    public Output<String> managedInstanceResourceId() {
        return this.managedInstanceResourceId;
    }

    /**
     * Password credential.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Type of connection info
     * Expected value is &#39;MiSqlConnectionInfo&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * User name
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private MiSqlConnectionInfoArgs() {}

    private MiSqlConnectionInfoArgs(MiSqlConnectionInfoArgs $) {
        this.managedInstanceResourceId = $.managedInstanceResourceId;
        this.password = $.password;
        this.type = $.type;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MiSqlConnectionInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MiSqlConnectionInfoArgs $;

        public Builder() {
            $ = new MiSqlConnectionInfoArgs();
        }

        public Builder(MiSqlConnectionInfoArgs defaults) {
            $ = new MiSqlConnectionInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder managedInstanceResourceId(Output<String> managedInstanceResourceId) {
            $.managedInstanceResourceId = managedInstanceResourceId;
            return this;
        }

        public Builder managedInstanceResourceId(String managedInstanceResourceId) {
            return managedInstanceResourceId(Output.of(managedInstanceResourceId));
        }

        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public MiSqlConnectionInfoArgs build() {
            $.managedInstanceResourceId = Objects.requireNonNull($.managedInstanceResourceId, "expected parameter 'managedInstanceResourceId' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
