// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.azurenative.securityinsights.enums.DataTypeState;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Exchange data type connection.
 * 
 */
public final class OfficeDataConnectorDataTypesExchangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final OfficeDataConnectorDataTypesExchangeArgs Empty = new OfficeDataConnectorDataTypesExchangeArgs();

    /**
     * Describe whether this data type connection is enabled or not.
     * 
     */
    @Import(name="state")
    private @Nullable Output<Either<String,DataTypeState>> state;

    public Optional<Output<Either<String,DataTypeState>>> state() {
        return Optional.ofNullable(this.state);
    }

    private OfficeDataConnectorDataTypesExchangeArgs() {}

    private OfficeDataConnectorDataTypesExchangeArgs(OfficeDataConnectorDataTypesExchangeArgs $) {
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OfficeDataConnectorDataTypesExchangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OfficeDataConnectorDataTypesExchangeArgs $;

        public Builder() {
            $ = new OfficeDataConnectorDataTypesExchangeArgs();
        }

        public Builder(OfficeDataConnectorDataTypesExchangeArgs defaults) {
            $ = new OfficeDataConnectorDataTypesExchangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder state(@Nullable Output<Either<String,DataTypeState>> state) {
            $.state = state;
            return this;
        }

        public Builder state(Either<String,DataTypeState> state) {
            return state(Output.of(state));
        }

        public OfficeDataConnectorDataTypesExchangeArgs build() {
            return $;
        }
    }

}
