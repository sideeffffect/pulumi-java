// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.azurenative.securityinsights.inputs.OfficeDataConnectorDataTypesExchangeArgs;
import com.pulumi.azurenative.securityinsights.inputs.OfficeDataConnectorDataTypesSharePointArgs;
import com.pulumi.azurenative.securityinsights.inputs.OfficeDataConnectorDataTypesTeamsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The available data types for office data connector.
 * 
 */
public final class OfficeDataConnectorDataTypesArgs extends com.pulumi.resources.ResourceArgs {

    public static final OfficeDataConnectorDataTypesArgs Empty = new OfficeDataConnectorDataTypesArgs();

    /**
     * Exchange data type connection.
     * 
     */
    @Import(name="exchange")
    private @Nullable Output<OfficeDataConnectorDataTypesExchangeArgs> exchange;

    public Optional<Output<OfficeDataConnectorDataTypesExchangeArgs>> exchange() {
        return Optional.ofNullable(this.exchange);
    }

    /**
     * SharePoint data type connection.
     * 
     */
    @Import(name="sharePoint")
    private @Nullable Output<OfficeDataConnectorDataTypesSharePointArgs> sharePoint;

    public Optional<Output<OfficeDataConnectorDataTypesSharePointArgs>> sharePoint() {
        return Optional.ofNullable(this.sharePoint);
    }

    /**
     * Teams data type connection.
     * 
     */
    @Import(name="teams")
    private @Nullable Output<OfficeDataConnectorDataTypesTeamsArgs> teams;

    public Optional<Output<OfficeDataConnectorDataTypesTeamsArgs>> teams() {
        return Optional.ofNullable(this.teams);
    }

    private OfficeDataConnectorDataTypesArgs() {}

    private OfficeDataConnectorDataTypesArgs(OfficeDataConnectorDataTypesArgs $) {
        this.exchange = $.exchange;
        this.sharePoint = $.sharePoint;
        this.teams = $.teams;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OfficeDataConnectorDataTypesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OfficeDataConnectorDataTypesArgs $;

        public Builder() {
            $ = new OfficeDataConnectorDataTypesArgs();
        }

        public Builder(OfficeDataConnectorDataTypesArgs defaults) {
            $ = new OfficeDataConnectorDataTypesArgs(Objects.requireNonNull(defaults));
        }

        public Builder exchange(@Nullable Output<OfficeDataConnectorDataTypesExchangeArgs> exchange) {
            $.exchange = exchange;
            return this;
        }

        public Builder exchange(OfficeDataConnectorDataTypesExchangeArgs exchange) {
            return exchange(Output.of(exchange));
        }

        public Builder sharePoint(@Nullable Output<OfficeDataConnectorDataTypesSharePointArgs> sharePoint) {
            $.sharePoint = sharePoint;
            return this;
        }

        public Builder sharePoint(OfficeDataConnectorDataTypesSharePointArgs sharePoint) {
            return sharePoint(Output.of(sharePoint));
        }

        public Builder teams(@Nullable Output<OfficeDataConnectorDataTypesTeamsArgs> teams) {
            $.teams = teams;
            return this;
        }

        public Builder teams(OfficeDataConnectorDataTypesTeamsArgs teams) {
            return teams(Output.of(teams));
        }

        public OfficeDataConnectorDataTypesArgs build() {
            return $;
        }
    }

}
