package com.lft.pattern14.command;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-17 9:39
 * <p>
 * Class Name:      Command
 * Package Name:    com.lft.pattern14.command
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Command {
	public static void main(String[] args) {
		
		/**
		 * Spring中的JdbcTemplate类的query(final String sql, final ResultSetExtractor<T> rse)方法中，
		 * 有一个内部类 QueryStatementCallback 实现了 StatementCallback接口。
		 * QueryStatementCallback在这里也充当了接收者角色。
		 */
		// public class JdbcTemplate extends JdbcAccessor implements JdbcOperations {
		// 		@Override
		// 		@Nullable
		// 		public <T> T query(final String sql, final ResultSetExtractor<T> rse) throws DataAccessException {
		// 			Assert.notNull(sql, "SQL must not be null");
		// 			Assert.notNull(rse, "ResultSetExtractor must not be null");
		// 			if (logger.isDebugEnabled()) {
		// 				logger.debug("Executing SQL query [" + sql + "]");
		// 			}
		// 			/**
		// 			 * Callback to execute the query.
		// 			 */
		// 			class QueryStatementCallback implements StatementCallback<T>, SqlProvider {
		// 				@Override
		// 				@Nullable
		// 				public T doInStatement(Statement stmt) throws SQLException {
		// 					ResultSet rs = null;
		// 					try {
		// 						rs = stmt.executeQuery(sql);
		// 						return rse.extractData(rs);
		// 					}
		// 					finally {
		// 						JdbcUtils.closeResultSet(rs);
		// 					}
		// 				}
		// 				@Override
		// 				public String getSql() {
		// 					return sql;
		// 				}
		// 			}
		// 			return execute(new QueryStatementCallback());
		// 		}
		//
		//		@Override
		// 		@Nullable
		// 		public <T> T execute(StatementCallback<T> action) throws DataAccessException {
		// 			Assert.notNull(action, "Callback object must not be null");
		// 			Connection con = DataSourceUtils.getConnection(obtainDataSource());
		// 			Statement stmt = null;
		// 			try {
		// 				stmt = con.createStatement();
		// 				applyStatementSettings(stmt);
		// 				T result = action.doInStatement(stmt);
		// 				handleWarnings(stmt);
		// 				return result;
		// 			}
		// 			catch (SQLException ex) {
		// 				String sql = getSql(action);
		// 				JdbcUtils.closeStatement(stmt);
		// 				stmt = null;
		// 				DataSourceUtils.releaseConnection(con, getDataSource());
		// 				con = null;
		// 				throw translateException("StatementCallback", sql, ex);
		// 			}
		// 			finally {
		// 				JdbcUtils.closeStatement(stmt);
		// 				DataSourceUtils.releaseConnection(con, getDataSource());
		// 			}
		// 		}
		// }
		
		/**
		 * 接口 StatementCallback,这个接口就相当于 Command 接口。其中仅有一个抽象方法 doInStatement();
		 */
		// @FunctionalInterface
		// public interface StatementCallback<T> {
		// 		@Nullable
		// 		T doInStatement(Statement stmt) throws SQLException, DataAccessException;
		// }
	}
}
