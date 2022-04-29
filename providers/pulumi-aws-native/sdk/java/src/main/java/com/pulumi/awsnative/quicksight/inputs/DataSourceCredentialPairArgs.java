// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.awsnative.quicksight.inputs.DataSourceParametersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;The combination of user name and password that are used as credentials.&lt;/p&gt;
 * 
 */
public final class DataSourceCredentialPairArgs extends ResourceArgs {

    public static final DataSourceCredentialPairArgs Empty = new DataSourceCredentialPairArgs();

    /**
     * &lt;p&gt;A set of alternate data source parameters that you want to share for these
     *             credentials. The credentials are applied in tandem with the data source parameters when
     *             you copy a data source by using a create or update request. The API operation compares
     *             the &lt;code&gt;DataSourceParameters&lt;/code&gt; structure that&#39;s in the request with the
     *             structures in the &lt;code&gt;AlternateDataSourceParameters&lt;/code&gt; allow list. If the
     *             structures are an exact match, the request is allowed to use the new data source with
     *             the existing credentials. If the &lt;code&gt;AlternateDataSourceParameters&lt;/code&gt; list is
     *             null, the &lt;code&gt;DataSourceParameters&lt;/code&gt; originally used with these
     *                 &lt;code&gt;Credentials&lt;/code&gt; is automatically allowed.&lt;/p&gt;
     * 
     */
    @Import(name="alternateDataSourceParameters")
    private @Nullable Output<List<DataSourceParametersArgs>> alternateDataSourceParameters;

    /**
     * @return &lt;p&gt;A set of alternate data source parameters that you want to share for these
     *             credentials. The credentials are applied in tandem with the data source parameters when
     *             you copy a data source by using a create or update request. The API operation compares
     *             the &lt;code&gt;DataSourceParameters&lt;/code&gt; structure that&#39;s in the request with the
     *             structures in the &lt;code&gt;AlternateDataSourceParameters&lt;/code&gt; allow list. If the
     *             structures are an exact match, the request is allowed to use the new data source with
     *             the existing credentials. If the &lt;code&gt;AlternateDataSourceParameters&lt;/code&gt; list is
     *             null, the &lt;code&gt;DataSourceParameters&lt;/code&gt; originally used with these
     *                 &lt;code&gt;Credentials&lt;/code&gt; is automatically allowed.&lt;/p&gt;
     * 
     */
    public Optional<Output<List<DataSourceParametersArgs>>> alternateDataSourceParameters() {
        return Optional.ofNullable(this.alternateDataSourceParameters);
    }

    /**
     * &lt;p&gt;Password.&lt;/p&gt;
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return &lt;p&gt;Password.&lt;/p&gt;
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * &lt;p&gt;User name.&lt;/p&gt;
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return &lt;p&gt;User name.&lt;/p&gt;
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private DataSourceCredentialPairArgs() {}

    private DataSourceCredentialPairArgs(DataSourceCredentialPairArgs $) {
        this.alternateDataSourceParameters = $.alternateDataSourceParameters;
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceCredentialPairArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceCredentialPairArgs $;

        public Builder() {
            $ = new DataSourceCredentialPairArgs();
        }

        public Builder(DataSourceCredentialPairArgs defaults) {
            $ = new DataSourceCredentialPairArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alternateDataSourceParameters &lt;p&gt;A set of alternate data source parameters that you want to share for these
         *             credentials. The credentials are applied in tandem with the data source parameters when
         *             you copy a data source by using a create or update request. The API operation compares
         *             the &lt;code&gt;DataSourceParameters&lt;/code&gt; structure that&#39;s in the request with the
         *             structures in the &lt;code&gt;AlternateDataSourceParameters&lt;/code&gt; allow list. If the
         *             structures are an exact match, the request is allowed to use the new data source with
         *             the existing credentials. If the &lt;code&gt;AlternateDataSourceParameters&lt;/code&gt; list is
         *             null, the &lt;code&gt;DataSourceParameters&lt;/code&gt; originally used with these
         *                 &lt;code&gt;Credentials&lt;/code&gt; is automatically allowed.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder alternateDataSourceParameters(@Nullable Output<List<DataSourceParametersArgs>> alternateDataSourceParameters) {
            $.alternateDataSourceParameters = alternateDataSourceParameters;
            return this;
        }

        /**
         * @param alternateDataSourceParameters &lt;p&gt;A set of alternate data source parameters that you want to share for these
         *             credentials. The credentials are applied in tandem with the data source parameters when
         *             you copy a data source by using a create or update request. The API operation compares
         *             the &lt;code&gt;DataSourceParameters&lt;/code&gt; structure that&#39;s in the request with the
         *             structures in the &lt;code&gt;AlternateDataSourceParameters&lt;/code&gt; allow list. If the
         *             structures are an exact match, the request is allowed to use the new data source with
         *             the existing credentials. If the &lt;code&gt;AlternateDataSourceParameters&lt;/code&gt; list is
         *             null, the &lt;code&gt;DataSourceParameters&lt;/code&gt; originally used with these
         *                 &lt;code&gt;Credentials&lt;/code&gt; is automatically allowed.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder alternateDataSourceParameters(List<DataSourceParametersArgs> alternateDataSourceParameters) {
            return alternateDataSourceParameters(Output.of(alternateDataSourceParameters));
        }

        /**
         * @param alternateDataSourceParameters &lt;p&gt;A set of alternate data source parameters that you want to share for these
         *             credentials. The credentials are applied in tandem with the data source parameters when
         *             you copy a data source by using a create or update request. The API operation compares
         *             the &lt;code&gt;DataSourceParameters&lt;/code&gt; structure that&#39;s in the request with the
         *             structures in the &lt;code&gt;AlternateDataSourceParameters&lt;/code&gt; allow list. If the
         *             structures are an exact match, the request is allowed to use the new data source with
         *             the existing credentials. If the &lt;code&gt;AlternateDataSourceParameters&lt;/code&gt; list is
         *             null, the &lt;code&gt;DataSourceParameters&lt;/code&gt; originally used with these
         *                 &lt;code&gt;Credentials&lt;/code&gt; is automatically allowed.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder alternateDataSourceParameters(DataSourceParametersArgs... alternateDataSourceParameters) {
            return alternateDataSourceParameters(List.of(alternateDataSourceParameters));
        }

        /**
         * @param password &lt;p&gt;Password.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password &lt;p&gt;Password.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username &lt;p&gt;User name.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username &lt;p&gt;User name.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public DataSourceCredentialPairArgs build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
