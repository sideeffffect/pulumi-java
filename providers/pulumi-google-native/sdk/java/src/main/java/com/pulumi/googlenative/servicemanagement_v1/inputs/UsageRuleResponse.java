// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Usage configuration rules for the service. NOTE: Under development. Use this rule to configure unregistered calls for the service. Unregistered calls are calls that do not contain consumer project identity. (Example: calls that do not contain an API key). By default, API methods do not allow unregistered calls, and each method call must be identified by a consumer project identity. Use this rule to allow/disallow unregistered calls. Example of an API that wants to allow unregistered calls for entire service. usage: rules: - selector: &#34;*&#34; allow_unregistered_calls: true Example of a method that wants to allow unregistered calls. usage: rules: - selector: &#34;google.example.library.v1.LibraryService.CreateBook&#34; allow_unregistered_calls: true
 * 
 */
public final class UsageRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final UsageRuleResponse Empty = new UsageRuleResponse();

    /**
     * If true, the selected method allows unregistered calls, e.g. calls that don&#39;t identify any user or application.
     * 
     */
    @Import(name="allowUnregisteredCalls", required=true)
    private Boolean allowUnregisteredCalls;

    public Boolean allowUnregisteredCalls() {
        return this.allowUnregisteredCalls;
    }

    /**
     * Selects the methods to which this rule applies. Use &#39;*&#39; to indicate all methods in all APIs. Refer to selector for syntax details.
     * 
     */
    @Import(name="selector", required=true)
    private String selector;

    public String selector() {
        return this.selector;
    }

    /**
     * If true, the selected method should skip service control and the control plane features, such as quota and billing, will not be available. This flag is used by Google Cloud Endpoints to bypass checks for internal methods, such as service health check methods.
     * 
     */
    @Import(name="skipServiceControl", required=true)
    private Boolean skipServiceControl;

    public Boolean skipServiceControl() {
        return this.skipServiceControl;
    }

    private UsageRuleResponse() {}

    private UsageRuleResponse(UsageRuleResponse $) {
        this.allowUnregisteredCalls = $.allowUnregisteredCalls;
        this.selector = $.selector;
        this.skipServiceControl = $.skipServiceControl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UsageRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UsageRuleResponse $;

        public Builder() {
            $ = new UsageRuleResponse();
        }

        public Builder(UsageRuleResponse defaults) {
            $ = new UsageRuleResponse(Objects.requireNonNull(defaults));
        }

        public Builder allowUnregisteredCalls(Boolean allowUnregisteredCalls) {
            $.allowUnregisteredCalls = allowUnregisteredCalls;
            return this;
        }

        public Builder selector(String selector) {
            $.selector = selector;
            return this;
        }

        public Builder skipServiceControl(Boolean skipServiceControl) {
            $.skipServiceControl = skipServiceControl;
            return this;
        }

        public UsageRuleResponse build() {
            $.allowUnregisteredCalls = Objects.requireNonNull($.allowUnregisteredCalls, "expected parameter 'allowUnregisteredCalls' to be non-null");
            $.selector = Objects.requireNonNull($.selector, "expected parameter 'selector' to be non-null");
            $.skipServiceControl = Objects.requireNonNull($.skipServiceControl, "expected parameter 'skipServiceControl' to be non-null");
            return $;
        }
    }

}
