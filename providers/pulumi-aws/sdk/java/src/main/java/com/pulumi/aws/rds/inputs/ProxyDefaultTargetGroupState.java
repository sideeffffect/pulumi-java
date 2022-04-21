// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.aws.rds.inputs.ProxyDefaultTargetGroupConnectionPoolConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProxyDefaultTargetGroupState extends com.pulumi.resources.ResourceArgs {

    public static final ProxyDefaultTargetGroupState Empty = new ProxyDefaultTargetGroupState();

    /**
     * The Amazon Resource Name (ARN) representing the target group.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The settings that determine the size and behavior of the connection pool for the target group.
     * 
     */
    @Import(name="connectionPoolConfig")
    private @Nullable Output<ProxyDefaultTargetGroupConnectionPoolConfigGetArgs> connectionPoolConfig;

    public Optional<Output<ProxyDefaultTargetGroupConnectionPoolConfigGetArgs>> connectionPoolConfig() {
        return Optional.ofNullable(this.connectionPoolConfig);
    }

    /**
     * Name of the RDS DB Proxy.
     * 
     */
    @Import(name="dbProxyName")
    private @Nullable Output<String> dbProxyName;

    public Optional<Output<String>> dbProxyName() {
        return Optional.ofNullable(this.dbProxyName);
    }

    /**
     * The name of the default target group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ProxyDefaultTargetGroupState() {}

    private ProxyDefaultTargetGroupState(ProxyDefaultTargetGroupState $) {
        this.arn = $.arn;
        this.connectionPoolConfig = $.connectionPoolConfig;
        this.dbProxyName = $.dbProxyName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProxyDefaultTargetGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProxyDefaultTargetGroupState $;

        public Builder() {
            $ = new ProxyDefaultTargetGroupState();
        }

        public Builder(ProxyDefaultTargetGroupState defaults) {
            $ = new ProxyDefaultTargetGroupState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder connectionPoolConfig(@Nullable Output<ProxyDefaultTargetGroupConnectionPoolConfigGetArgs> connectionPoolConfig) {
            $.connectionPoolConfig = connectionPoolConfig;
            return this;
        }

        public Builder connectionPoolConfig(ProxyDefaultTargetGroupConnectionPoolConfigGetArgs connectionPoolConfig) {
            return connectionPoolConfig(Output.of(connectionPoolConfig));
        }

        public Builder dbProxyName(@Nullable Output<String> dbProxyName) {
            $.dbProxyName = dbProxyName;
            return this;
        }

        public Builder dbProxyName(String dbProxyName) {
            return dbProxyName(Output.of(dbProxyName));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ProxyDefaultTargetGroupState build() {
            return $;
        }
    }

}
