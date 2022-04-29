// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.recaptcha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnterpriseKeyIosSettingsArgs extends ResourceArgs {

    public static final EnterpriseKeyIosSettingsArgs Empty = new EnterpriseKeyIosSettingsArgs();

    /**
     * If set to true, it means allowed_bundle_ids will not be enforced.
     * 
     */
    @Import(name="allowAllBundleIds")
    private @Nullable Output<Boolean> allowAllBundleIds;

    /**
     * @return If set to true, it means allowed_bundle_ids will not be enforced.
     * 
     */
    public Optional<Output<Boolean>> allowAllBundleIds() {
        return Optional.ofNullable(this.allowAllBundleIds);
    }

    /**
     * iOS bundle ids of apps allowed to use the key. Example: &#39;com.companyname.productname.appname&#39;
     * 
     */
    @Import(name="allowedBundleIds")
    private @Nullable Output<List<String>> allowedBundleIds;

    /**
     * @return iOS bundle ids of apps allowed to use the key. Example: &#39;com.companyname.productname.appname&#39;
     * 
     */
    public Optional<Output<List<String>>> allowedBundleIds() {
        return Optional.ofNullable(this.allowedBundleIds);
    }

    private EnterpriseKeyIosSettingsArgs() {}

    private EnterpriseKeyIosSettingsArgs(EnterpriseKeyIosSettingsArgs $) {
        this.allowAllBundleIds = $.allowAllBundleIds;
        this.allowedBundleIds = $.allowedBundleIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnterpriseKeyIosSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnterpriseKeyIosSettingsArgs $;

        public Builder() {
            $ = new EnterpriseKeyIosSettingsArgs();
        }

        public Builder(EnterpriseKeyIosSettingsArgs defaults) {
            $ = new EnterpriseKeyIosSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowAllBundleIds If set to true, it means allowed_bundle_ids will not be enforced.
         * 
         * @return builder
         * 
         */
        public Builder allowAllBundleIds(@Nullable Output<Boolean> allowAllBundleIds) {
            $.allowAllBundleIds = allowAllBundleIds;
            return this;
        }

        /**
         * @param allowAllBundleIds If set to true, it means allowed_bundle_ids will not be enforced.
         * 
         * @return builder
         * 
         */
        public Builder allowAllBundleIds(Boolean allowAllBundleIds) {
            return allowAllBundleIds(Output.of(allowAllBundleIds));
        }

        /**
         * @param allowedBundleIds iOS bundle ids of apps allowed to use the key. Example: &#39;com.companyname.productname.appname&#39;
         * 
         * @return builder
         * 
         */
        public Builder allowedBundleIds(@Nullable Output<List<String>> allowedBundleIds) {
            $.allowedBundleIds = allowedBundleIds;
            return this;
        }

        /**
         * @param allowedBundleIds iOS bundle ids of apps allowed to use the key. Example: &#39;com.companyname.productname.appname&#39;
         * 
         * @return builder
         * 
         */
        public Builder allowedBundleIds(List<String> allowedBundleIds) {
            return allowedBundleIds(Output.of(allowedBundleIds));
        }

        /**
         * @param allowedBundleIds iOS bundle ids of apps allowed to use the key. Example: &#39;com.companyname.productname.appname&#39;
         * 
         * @return builder
         * 
         */
        public Builder allowedBundleIds(String... allowedBundleIds) {
            return allowedBundleIds(List.of(allowedBundleIds));
        }

        public EnterpriseKeyIosSettingsArgs build() {
            return $;
        }
    }

}
