// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoverycontrol.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetControlPanelArgs extends InvokeArgs {

    public static final GetControlPanelArgs Empty = new GetControlPanelArgs();

    /**
     * The Amazon Resource Name (ARN) of the cluster.
     * 
     */
    @Import(name="controlPanelArn", required=true)
    private String controlPanelArn;

    /**
     * @return The Amazon Resource Name (ARN) of the cluster.
     * 
     */
    public String controlPanelArn() {
        return this.controlPanelArn;
    }

    private GetControlPanelArgs() {}

    private GetControlPanelArgs(GetControlPanelArgs $) {
        this.controlPanelArn = $.controlPanelArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetControlPanelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetControlPanelArgs $;

        public Builder() {
            $ = new GetControlPanelArgs();
        }

        public Builder(GetControlPanelArgs defaults) {
            $ = new GetControlPanelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param controlPanelArn The Amazon Resource Name (ARN) of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder controlPanelArn(String controlPanelArn) {
            $.controlPanelArn = controlPanelArn;
            return this;
        }

        public GetControlPanelArgs build() {
            $.controlPanelArn = Objects.requireNonNull($.controlPanelArn, "expected parameter 'controlPanelArn' to be non-null");
            return $;
        }
    }

}
