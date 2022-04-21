// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLiveEventArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLiveEventArgs Empty = new GetLiveEventArgs();

    /**
     * The Media Services account name.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the live event, maximum length is 32.
     * 
     */
    @Import(name="liveEventName", required=true)
    private String liveEventName;

    public String liveEventName() {
        return this.liveEventName;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetLiveEventArgs() {}

    private GetLiveEventArgs(GetLiveEventArgs $) {
        this.accountName = $.accountName;
        this.liveEventName = $.liveEventName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLiveEventArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLiveEventArgs $;

        public Builder() {
            $ = new GetLiveEventArgs();
        }

        public Builder(GetLiveEventArgs defaults) {
            $ = new GetLiveEventArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder liveEventName(String liveEventName) {
            $.liveEventName = liveEventName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetLiveEventArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.liveEventName = Objects.requireNonNull($.liveEventName, "expected parameter 'liveEventName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
